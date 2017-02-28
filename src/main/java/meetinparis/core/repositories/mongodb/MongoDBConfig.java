package meetinparis.core.repositories.mongodb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories
public class MongoDBConfig extends AbstractMongoConfiguration {
	@Override
	protected String getDatabaseName() {
		return "MeetInParis";
	}
	
	@Override
    public @Bean MongoTemplate mongoTemplate() throws Exception 
    {
        return new MongoTemplate(mongo(), getDatabaseName());
    }

	@Override
	@Bean
	public Mongo mongo() throws Exception {
		return new MongoClient("localhost" , 27017 );
	}

	@Override
	protected String getMappingBasePackage() {
		return "com.oreilly.springdata.mongodb";
	}
}
