package com.examples;

import com.examples.knights.BraveKnight;
import com.examples.knights.Knight;
import com.examples.quests.Quest;
import com.examples.quests.RescueDamselQuest;
import com.examples.quests.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {

    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }

}
