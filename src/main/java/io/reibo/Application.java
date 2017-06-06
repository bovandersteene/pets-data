package io.reibo;

import io.reibo.pets.data.common.Gender;
import io.reibo.pets.data.owner.Owner;
import io.reibo.pets.data.owner.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.BooleanSupplier;

@SpringBootApplication
public class Application
{
    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean()
    public Boolean initData(){
        final Owner owner = new Owner();
        owner.setFirstName("firstname");
        owner.setLastName("lastname");
        owner.setGender(Gender.FEMALE);
        ownerRepository.save(owner);

        return true;
    }
}
