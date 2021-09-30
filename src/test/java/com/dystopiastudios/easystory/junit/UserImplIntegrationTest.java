package com.dystopiastudios.easystory.junit;

import com.dystopiastudios.easystory.domain.model.User;
import com.dystopiastudios.easystory.domain.repository.SubscriptionRepository;
import com.dystopiastudios.easystory.domain.repository.UserRepository;
import com.dystopiastudios.easystory.domain.service.UserService;
import com.dystopiastudios.easystory.exception.ResourceNotFoundException;
import com.dystopiastudios.easystory.service.UserServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import static org.mockito.Mockito.when;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
public class UserImplIntegrationTest {
    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @MockBean
    private SubscriptionRepository subscriptionRepository;

    @TestConfiguration
    static class UserImplIntegrationTestConfiguration{
        @Bean
        public UserService userService(){
            return new UserServiceImpl();
        }
    }


}

