//package com.mufic.Final.bootstrap;
//
//import com.mufic.Final.api.v2.model.*;
//import com.mufic.Final.api.v2.model.lists.*;
//import com.mufic.Final.domain.*;
//import com.mufic.Final.repositories.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.*;
//
//
//@Component
//public class Bootstrap implements CommandLineRunner {
//
//    @Autowired private CityRepository cityRepository;
//    @Autowired private StateRepository stateRepository;
//    @Autowired private CountryRepository countryRepository;
//    @Autowired private ProgramRepository programRepository;
//    @Autowired private StudentInfoRepository studentInfoRepository;
//
//    private List<Country> countries(){
//        List<Country> countries=new ArrayList<>();
//        countries.add(Country.builder().id(65L).name("Egypt").iso3("EGY").iso2("EG").phoneCode("20").capital("Cairo")
//                .currency("EGP").nativ("مصر").emoji("??").emojiU("U+1F1EA U+1F1EC").wikiDataId("Q79").build());
//        return countries;
//    }
//
//    private List<State> states(){
//        List<State> states=new ArrayList<>();
//        states.add(State.builder().id(3222L).name("Kafr el-Sheikh Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3223L).name("Cairo Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3224L).name("Damietta Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3225L).name("Aswan Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3226L).name("Sohag Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3227L).name("North Sinai Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3228L).name("Monufia Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3229L).name("Port Said Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3230L).name("Beni Suef Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3231L).name("Matrouh Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3232L).name("Qalyubia Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3233L).name("Suez Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3234L).name("Gharbia Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3235L).name("Alexandria Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3236L).name("Asyut Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3237L).name("South Sinai Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3238L).name("Faiyum Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3239L).name("Giza Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3240L).name("Red Sea Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3241L).name("Beheira Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3242L).name("Luxor Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3243L).name("Minya Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3244L).name("Ismailia Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3245L).name("Dakahlia Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3246L).name("New Valley Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        states.add(State.builder().id(3247L).name("Qena Governorate").country(countryRepository.getOne(65L)).countryCode("EG").build());
//        return states;
//    }
//
//    private List<City> cities(){
//        List<City> cities=new ArrayList<>();
//        cities.add(City.builder().id(31755L).name("Abnūb").state(stateRepository.getOne(3236L)).stateCode("AST")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q975904").build());
//        cities.add(City.builder().id(31756L).name("Abu Simbel").state(stateRepository.getOne(3225L)).stateCode("ASN")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31757L).name("Abū Qurqāş").state(stateRepository.getOne(3243L)).stateCode("MN")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31758L).name("Abū Tīj").state(stateRepository.getOne(3236L)).stateCode("AST")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31759L).name("Abū al Maţāmīr").state(stateRepository.getOne(3241L)).stateCode("BH")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31760L).name("Ad Dilinjāt").state(stateRepository.getOne(3241L)).stateCode("BH")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31761L).name("Ain Sukhna").state(stateRepository.getOne(3233L)).stateCode("SUZ")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31762L).name("Ajā").state(stateRepository.getOne(3245L)).stateCode("DK")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31763L).name("Akhmīm").state(stateRepository.getOne(3226L)).stateCode("SHG")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31764L).name("Al Badārī").state(stateRepository.getOne(3236L)).stateCode("AST")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31765L).name("Al Balyanā").state(stateRepository.getOne(3226L)).stateCode("SHG")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31766L).name("Al Bawīţī").state(stateRepository.getOne(3239L)).stateCode("GZ")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31767L).name("Al Bājūr").state(stateRepository.getOne(3228L)).stateCode("MNF")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31768L).name("Al Fashn").state(stateRepository.getOne(3230L)).stateCode("BNS")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31769L).name("Al Fayyūm").state(stateRepository.getOne(3238L)).stateCode("FYM")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31770L).name("Al Jammālīyah").state(stateRepository.getOne(3245L)).stateCode("DK")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31771L).name("Al Khānkah").state(stateRepository.getOne(3232L)).stateCode("KB")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31772L).name("Al Khārijah").state(stateRepository.getOne(3246L)).stateCode("WAD")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31773L).name("Al Manshāh").state(stateRepository.getOne(3226L)).stateCode("SHG")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31774L).name("Al Manzalah").state(stateRepository.getOne(3245L)).stateCode("DK")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31775L).name("Al Manşūrah").state(stateRepository.getOne(3245L)).stateCode("DK")
//                .country(countryRepository.getOne(65L)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//
//        return  cities;
//    }
//
//    CourseListDTO courseListDTO(){
//        CourseListDTO courseListDTO=new CourseListDTO(new ArrayList<>());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS111").nameArabic("أساسیات علوم الحاسب").nameEnglish("Fundamentals of Computer Science").hours(3)
//                .lecHours(2.50).labHours(1).description("").program(8).force(1).build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS112").nameArabic("برمجة – ١").nameEnglish("Programming-1").hours(3)
//                .lecHours(2.5).labHours(1).description("").program(8).force(1).build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS213").nameArabic("برمجة – ٢").nameEnglish("Programming-2").hours(3)
//                .lecHours(2.50).labHours(1).description("").program(8).preCourse("BCS112").force(1).build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS214").nameArabic("ھیاكل بیانات").nameEnglish("Data structures").hours(3)
//                .lecHours(2.5).labHours(1).description("").program(8).force(1).build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS221").nameArabic("تصمیم منطقي").nameEnglish("Logic Design").hours(3)
//                .lecHours(2.5).labHours(1).description("").program(7).preCourse("BIT111").force(1).build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS241").nameArabic("نظم التشغیل").nameEnglish("Operating Systems").hours(3)
//                .lecHours(2.5).labHours(1).description("").program(8).force(1).build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS251").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(2.5).labHours(1).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS316").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS322").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS323").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS361").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS471").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS472").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS495").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BCS496").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BDS121").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BDS122").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BDS123").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BDS211").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU111").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU112").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU113").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU114").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU115").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU116").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU117").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU118").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU131").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BHU165").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO001").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO251").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO252").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO261").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO262").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO352").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO353").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO451").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO452").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO454").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO455").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO461").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO465").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO466").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO468").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO469").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO470").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIO498").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIS211").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIS421").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIT111").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIT222").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIT416").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BIT441").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BLA001").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BLA002").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BLA003").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BLA004").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BMA001").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BMA111").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BMA112").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BMA113").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BMA214").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BST121").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BST122").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//        courseListDTO.getCourses().add(CourseDTO.builder().code("BTR481").nameArabic("").nameEnglish("").hours(3)
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
//
//        return courseListDTO;
//    }
//
//    DepartmentListDTO departmentListDTO(){
//        DepartmentListDTO departmentListDTO= new DepartmentListDTO(new ArrayList<>());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(1L).nameArabic("عام").nameEnglish("General").code("G").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(2L).nameArabic("علو الحاسب").nameEnglish("Computer Science").code("CS").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(3L).nameArabic("تكنولوجيا المعلومات").nameEnglish("Information Technology").code("IT").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(4L).nameArabic("نظم المعلومات").nameEnglish("Information System").code("IS").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(5L).nameArabic("بحوث العمليات").nameEnglish("Orgnization Research").code("OR").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(6L).nameArabic("هندسه النظم").nameEnglish("Software Engineering").code("SE").graduationProjectHours(136)
//                        .graduationHours(128).minTerms(8).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(7L).nameArabic("الحوسبه والمعلوماتيه الحيويه").nameEnglish("Bioinformatics").code("BIO").graduationProjectHours(136)
//                        .graduationHours(128).minTerms(8).maxDegreeOnFail(64).build());
//
//        return departmentListDTO;
//    }
//
//    List<PointSystem> pointSystems(){
//        List<PointSystem> pointSystems=new ArrayList<>();
//        pointSystems.add(PointSystem.builder().nameEnglish("A+").nameArabic("A+").degreeLow(90).degreeHigh(100).points(4).build());
//        pointSystems.add(PointSystem.builder().nameEnglish("A").nameArabic("A").degreeLow(85).degreeHigh(90).points(4).build());
//        pointSystems.add(PointSystem.builder().nameEnglish("B+").nameArabic("B+").degreeLow(80).degreeHigh(85).points(3).build());
//        pointSystems.add(PointSystem.builder().nameEnglish("B").nameArabic("B").degreeLow(75).degreeHigh(80).points(3).build());
//        pointSystems.add(PointSystem.builder().nameEnglish("C+").nameArabic("C+").degreeLow(70).degreeHigh(75).points(3).build());
//        pointSystems.add(PointSystem.builder().nameEnglish("C").nameArabic("C").degreeLow(65).degreeHigh(70).points(2).build());
//        pointSystems.add(PointSystem.builder().nameEnglish("D+").nameArabic("D+").degreeLow(60).degreeHigh(65).points(2).build());
//        pointSystems.add(PointSystem.builder().nameEnglish("D").nameArabic("D").degreeLow(50).degreeHigh(60).points(2).build());
//        pointSystems.add(PointSystem.builder().nameEnglish("F").nameArabic("F").degreeLow(0).degreeHigh(50).points(0).build());
//        return pointSystems;
//    }
//
//    List<Privilege> privileges(){
//        List<Privilege> privileges=new ArrayList<>();
//        privileges.add(Privilege.builder().name(EPrivilege.READ_API).build());
//        return privileges;
//    }
//
//    List<ProgramLevel> programLevels(){
//        List<ProgramLevel> programLevels=new ArrayList<>();
//        programLevels.add(ProgramLevel.builder().nameEnglish("Level 1").nameArabic("المستوى الاول").minHours(0).build());
//        programLevels.add(ProgramLevel.builder().nameEnglish("Level 2").nameArabic("المستوى التانى").minHours(34).build());
//        programLevels.add(ProgramLevel.builder().nameEnglish("Level 3").nameArabic("المستوى الثالث").minHours(68).build());
//        programLevels.add(ProgramLevel.builder().nameEnglish("Level 4").nameArabic("المستوى الرابع").minHours(102).build());
//        return programLevels;
//    }
//
//
//    List<Program> programs(){
//        List<Program> programs=new ArrayList<>();
//        programs.add(Program.builder().id(1L).nameArabic("متطلبات تاهيليه").nameEnglish("متطلبات تاهيليه").hours(0).build());
//        programs.add(Program.builder().id(2L).nameArabic("متطلبات جامعه").nameEnglish("متطلبات جامعه").hours(12).build());
//        programs.add(Program.builder().id(3L).nameArabic("متطلبات الكليه").nameEnglish("متطلبات الكليه").hours(63).build());
//        programs.add(Program.builder().id(4L).nameArabic("متطلبات تخصص").nameEnglish("متطلبات تخصص").hours(61).build());
//        programs.add(Program.builder().id(5L).nameArabic("متطلبات جامعه اجباريه").nameEnglish("متطلبات جامعه اجباريه").hours(6).underRequirement(programRepository.getOne(2L)).build());
//        programs.add(Program.builder().id(6L).nameArabic("متطلبات جامعه اختياريه").nameEnglish("متطلبات جامعه اختياريه").hours(6).underRequirement(programRepository.getOne(2L)).build());
//        programs.add(Program.builder().id(7L).nameArabic("رياضيات وعلوم اساسيه اجباريه").nameEnglish("رياضيات وعلوم اساسيه اجباريه").hours(21).underRequirement(programRepository.getOne(3L)).build());
//        programs.add(Program.builder().id(8L).nameArabic("علوم حاسب اساسيه").nameEnglish("علوم حاسب اساسيه").hours(42).underRequirement(programRepository.getOne(3L)).build());
//        programs.add(Program.builder().id(9L).nameArabic("علوم تطبيقية").nameEnglish("علوم تطبيقية").hours(45).underRequirement(programRepository.getOne(4L)).build());
//        programs.add(Program.builder().id(10L).nameArabic("تدريب ميدانى").nameEnglish("تدريب ميدانى").hours(2).underRequirement(programRepository.getOne(4L)).build());
//        programs.add(Program.builder().id(11L).nameArabic("مشروع").nameEnglish("مشروع").hours(6).underRequirement(programRepository.getOne(4L)).build());
//        programs.add(Program.builder().id(12L).nameArabic("موضوعات تحددها المؤسسه").nameEnglish("موضوعات تحددها المؤسسه").hours(8).underRequirement(programRepository.getOne(4L)).build());
//        return programs;
//    }
//
//
//    List<RegularTermRules> regularTermRules(){
//        List<RegularTermRules> regularTermRules=new ArrayList<>();
//
//        regularTermRules.add(RegularTermRules.builder().gpaLow(0).gpaHigh(1).hourMin(9).hourMax(12).hourSpMin(2).hourSpMax(12).build());
//        regularTermRules.add(RegularTermRules.builder().gpaLow(1).gpaHigh(2).hourMin(9).hourMax(15).hourSpMin(2).hourSpMax(12).build());
//        regularTermRules.add(RegularTermRules.builder().gpaLow(2).gpaHigh(4).hourMin(9).hourMax(18).hourSpMin(2).hourSpMax(12).build());
//
//        return regularTermRules;
//    }
//
//    List<SummerTermRules> summerTermRules(){
//        List<SummerTermRules> summerTermRules=new ArrayList<>();
//        summerTermRules.add(SummerTermRules.builder().gpaLow(0).gpaHigh(4).hourMin(0).hourMax(6).hourSpMin(0).hourSpMax(9).build());
//        return summerTermRules;
//    }
//
//    List<Role> roles(){
//        List<Role> roles=new ArrayList<>();
//        roles.add(Role.builder().name(ERole.ROLE_ADMIN).description("Administrator ").privileges(new ArrayList<>()).build());
//        roles.add(Role.builder().name(ERole.ROLE_STUDENT).description("Administrator ").privileges(new ArrayList<>()).build());
//        roles.add(Role.builder().name(ERole.ROLE_DOCTOR).description("Administrator ").privileges(new ArrayList<>()).build());
//        roles.add(Role.builder().name(ERole.ROLE_USER).description("Administrator ").privileges(new ArrayList<>()).build());
//        return roles;
//    }
//
//    StudentListDTO studentListDTO(){
//        StudentListDTO studentListDTO=new StudentListDTO(new ArrayList<>());
//        studentListDTO.getStudents().add(StudentDTO.builder().nameArabic("مصطفى خالد").nameEnglish("Mustafa Khaled").nationality("مصرى").gender("ذكر")
//                .religion("مسلم").DOB(new Date()).nationalId("123456789").guardianName("خالد ابراهيم").email("asdxasd012@gmail.com").secSchool("الثانوى العام").preQualfication("علمى رياضه").degrees(152)
//                .studentInfo(1L).user(1L).guide(1L).department(1L).city(31755L).build());
//        return studentListDTO;
//    }
//
//    StudentInfoListDTO studentInfoListDTO(){
//        StudentInfoListDTO studentInfoListDTO= new StudentInfoListDTO(new ArrayList<>());
//        studentInfoListDTO.getStudentInfos().add(StudentInfoDTO.builder().gpa2Cnt(0).build());
//
//        return studentInfoListDTO;
//    }
//
//    TeachingStaffListDTO teachingStaffListDTO(){
//        TeachingStaffListDTO teachingStaffListDTO=new TeachingStaffListDTO(new ArrayList<>());
//
//        teachingStaffListDTO.getTeachingStaffs().add(TeachingStaffDTO.builder().nameArabic("ا-د-عربى كشك").nameEnglish("Arabi keshk").build());
//
//        return teachingStaffListDTO;
//    }
//
//    UserListDTO userListDTO(){
//        UserListDTO userListDTO=new UserListDTO(new ArrayList<>());
//        userListDTO.getUsers().add(UserDTO.builder().name("Mustafa").username("ADMIN").email("admin@fci.com").password("admin").build());
//        return userListDTO;
//
//    }
//
//
//
//
//
//
//
//
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//    }
//}
