package eu.digitalum.productservice;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import eu.digitalum.productservice.entity.Product;
import eu.digitalum.productservice.repository.ProductRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

	@Bean
    ApplicationRunner init(ProductRepository repository) {
        return args -> {
        	
        	repository.save(new Product("WDB030WCS", 
        			"Miele Wasmachine WDB030WCS",
        			"Ben je op zoek naar een degelijke wasmachine met een krachtige centrifuge? Dan is deze effficiënte en zuinige Miele met een inhoud van 7 kilo een goede keuze. Dit is een moderne machine die gebouwd is om lang mee te gaan.",
        			649d,"WDB030WCS_small.png","WDB030WCS_zoom.png"));

        	repository.save(new Product("WCE330WPS", 
        			"Miele wasmachine WCE 330 WPS",
        			"De Miele WCE 330 WPS is een wasmachine met een maximumcapaciteit van 8 kilogram. Het toestel heeft een grote waaier wasprogramma's, geschikt voor alle mogelijke types kleding en textiel. Je jeans was je zonder strepen, maar ook voor zijden kleding is het toestel ideaal. Vernieuwende features zoals het PowerWash 2.0-systeem en de koolborstelloze motor, maken dit een kampioen in energiezuinigheid.",
        			749d,"WCE330WPS_small.jpg","WCE330WPS_zoom.jpg"));
        	
        	repository.save(new Product("WCI670XL", 
        			"Miele TwinDos wasmachine WCI 670 XL",
        			"Met de Miele TwinDos wasmachine WCI 670 XL was je alle soorten textiel geheel op maat. Je kunt kiezen uit veel wasprogramma's en je wasmiddel wordt perfect gedoseerd. Deze Miele behandelt kwetsbare stoffen met respect en verbruikt weinig energie.",
        			999d,"WCI670XL_small.jpg","WCI670XL_zoom.jpg"));
        	
        	repository.save(new Product("WM16W790NL", 
        			"Siemens sensoFresh wasmachine WM16W790NL",
        			"Deze zuinige iQ700 ISensoric wasmachine is extra zuinig met energielabel A+++ -30%  en biedt extra veel ruimte voor jouw wasgoed. Hij heeft namelijk een capaciteit van 9 kilo. De wasmachine is te bedienen via een groot, overzichtelijk LED-display om de programmaduur, temperatuurselectie, max. toerental, resterende tijdsduur en 24 u eindtijd instelling, sensoFresh intensiteit en verbruiksindicatie te overzien.",
        			734d,"WM16W790NL_small.jpg","WM16W790NL_zoom.jpg"));
        	
        	repository.save(new Product("WDD330WCS", 
        			"Miele wasmachine WDD 330 WCS SpeedCare",
        			"De Miele wasmachine WDD 330 WCS SpeedCare is een uiterst zuinige machine die slecht 156 kWu op jaarbasis verbruikt en daarmee binnen een A+++ energie-efficiëntieklasse valt. Daarnaast is het ook een toestel dat zeer zacht en veilig is voor je wasgoed. De SoftCare-trommel is voorzien van een honingraatstructuur die ervoor zorgt dat een klein laagje water blijft staan tussen de trommel en je textiel.",
        			899d,"WDD330WCS_small.jpg","WDD330WCS_zoom.jpg"));
        	
        	repository.save(new Product("WL8FENS96", 
        			"AEG ÖKOMix wasmachine L8FENS96",
        			"De AEG ÖKOMix wasmachine L8FENS96 heeft een grote capaciteit en een zeer sterke centrifuge. Deze uiterst energiezuinige wasmachine maakt het mogelijk om volledig op maat je wasgoed te behandelen en heeft een aantal opties voor extra vervuilde was, maar ook voor wasgoed dat enkel een opfrisbeurt nodig heeft. Op de slijtvaste motor krijg je maar liefst tien jaar garantie.",
        			727d,"L8FENS96_small.jpg","L8FENS96_zoom.jpg"));
        	
        	repository.save(new Product("WW80K6404QW", 
        			"Samsung AddWash wasmachine WW80K6404QW",
        			"De Samsung AddWash is niet zomaar een wasmachine. Waar je bij andere machines moet wachten tot de volgende wasbeurt wanneer je nog een verloren kledingstuk vindt nadat de machine al aan het draaien is, kan je dit bij deze machine gewoon toevoegen.",
        			479d,"WW80K6404QW_small.jpg","WW80K6404QW_zoom.jpg"));
        	
        	repository.save(new Product("L6FBN84GP", 
        			"AEG ProSense wasmachine L6FBN84GP",
        			"De AEG ProSense wasmachine L6FBN84GP is zeer geschikt voor gezinnen die willen besparen op hun energierekening. Deze wasmachine is uiterst energie-efficiënt en heeft een aantal handige moderne opties om met zo min mogelijk water en energie alle soorten wasgoed optimaal te reinigen. Als je veel delicate en kwetsbare stoffen draagt, zul je veel profijt hebben van de speciaal ontworpen trommel.",
        			419d,"L6FBN84GP_small.jpg","L6FBN84GP_zoom.jpg"));
        	
        	repository.findAll().forEach(System.out::println);

        };
    }
}
