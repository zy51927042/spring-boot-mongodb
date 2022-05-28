package guru.springframework.config;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

//@Configuration
public class MongoDBConfig {
    //@Bean
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://192.168.99.100:32769");
    }
    //@Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "db");
    }
}