package com.deliveryBoy.service;

import com.deliveryBoy.Config.AppConstants;
import com.deliveryBoy.DeliveryBoyApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private final Logger logger = LoggerFactory.getLogger(DeliveryBoyApplication.class);

    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    public boolean updateLocation(String location){

            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location);
//            this.logger.info("Message Produced" + i);
//            System.out.println("________________________________________________________");
//        }
        return true;
    }

}
