package nero.service.provider.controller;

import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    private static final Logger logger = Logger.getLogger(ProviderController.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        logger.info("Begin index.");
        return "Hello: " + UUID.randomUUID().toString();
    }
}
