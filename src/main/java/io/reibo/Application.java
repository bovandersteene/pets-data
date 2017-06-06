package io.reibo;

import io.reibo.pets.data.common.Gender;
import io.reibo.pets.data.dog.Dog;
import io.reibo.pets.data.dog.DogRepository;
import io.reibo.pets.data.fish.Fish;
import io.reibo.pets.data.fish.FishRepository;
import io.reibo.pets.data.owner.Owner;
import io.reibo.pets.data.owner.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private DogRepository dogRepository;
    @Autowired
    private FishRepository fishRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean()
    public Boolean initData() {
        final Owner owner = new Owner();
        owner.setFirstName("firstname");
        owner.setLastName("lastname");
        owner.setGender(Gender.FEMALE);
        ownerRepository.save(owner);

        final Dog dog = new Dog();
        dog.setName("Max");
        dog.setBreed("Bernese mountain dog");
        dog.setLiveOutside(false);
        dog.setPaws(4);
        dogRepository.save(dog);

        final Dog dog1 = new Dog();
        dog1.setName("Marshall");
        dog1.setBreed("Dalmatier");
        dog1.setLiveOutside(false);
        dog1.setPaws(4);
        dogRepository.save(dog1);

        final Dog dog2 = new Dog();
        dog2.setName("Bud");
        dog2.setBreed("Buldogg");
        dog2.setLiveOutside(true);
        dog2.setPaws(3);
        dogRepository.save(dog2);

        final Fish fish1 = new Fish();
        fish1.setFins(2);
        fish1.setLiveInSea(true);
        fish1.setName("Nemo");
        fish1.setOwner(owner);
        fishRepository.save(fish1);


        return true;
    }
}
