//package com.mufic.Final.bootstrap;
//
//import com.mufic.Final.api.v2.model.CourseDTO;
//import com.mufic.Final.api.v2.model.DepartmentDTO;
//import com.mufic.Final.api.v2.model.StudentDTO;
//import com.mufic.Final.api.v2.model.lists.CourseListDTO;
//import com.mufic.Final.api.v2.model.lists.DepartmentListDTO;
//import com.mufic.Final.api.v2.model.lists.StudentListDTO;
//import com.mufic.Final.domain.*;
//import com.mufic.Final.repositories.CityRepository;
//import com.mufic.Final.repositories.CountryRepository;
//import com.mufic.Final.repositories.StateRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import static ch.qos.logback.core.rolling.helper.CompressionMode.GZ;
//import static sun.jvm.hotspot.debugger.win32.coff.DebugVC50X86RegisterEnums.BH;
//
//
//@Component
//public class Bootstrap implements CommandLineRunner {
//
//    @Autowired private CityRepository cityRepository;
//    @Autowired private StateRepository stateRepository;
//    @Autowired private CountryRepository countryRepository;
//
//    private List<Country> countries(){
//        List<Country> countries=new ArrayList<>();
//        countries.add(Country.builder().id(65l).name("Egypt").iso3("EGY").iso2("EG").phoneCode("20").capital("Cairo")
//                .currency("EGP").nativ("مصر").emoji("??").emojiU("U+1F1EA U+1F1EC").wikiDataId("Q79").build());
//        return countries;
//    }
//
//    private List<State> states(){
//        List<State> states=new ArrayList<>();
//        states.add(State.builder().id(3222l).name("Kafr el-Sheikh Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3223l).name("Cairo Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3224l).name("Damietta Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3225l).name("Aswan Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3226l).name("Sohag Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3227l).name("North Sinai Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3228l).name("Monufia Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3229l).name("Port Said Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3230l).name("Beni Suef Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3231l).name("Matrouh Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3232l).name("Qalyubia Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3233l).name("Suez Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3234l).name("Gharbia Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3235l).name("Alexandria Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3236l).name("Asyut Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3237l).name("South Sinai Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3238l).name("Faiyum Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3239l).name("Giza Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3240l).name("Red Sea Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3241l).name("Beheira Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3242l).name("Luxor Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3243l).name("Minya Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3244l).name("Ismailia Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3245l).name("Dakahlia Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3246l).name("New Valley Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        states.add(State.builder().id(3247l).name("Qena Governorate").country(countryRepository.getOne(65l)).countryCode("EG").build());
//        return states;
//    }
//
//    private List<City> cities(){
//        List<City> cities=new ArrayList<>();
//        cities.add(City.builder().id(31755l).name("Abnūb").state(stateRepository.getOne(3236l)).stateCode("AST")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q975904").build());
//        cities.add(City.builder().id(31756l).name("Abu Simbel").state(stateRepository.getOne(3225l)).stateCode("ASN")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31757l).name("Abū Qurqāş").state(stateRepository.getOne(3243l)).stateCode("MN")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31758l).name("Abū Tīj").state(stateRepository.getOne(3236l)).stateCode("AST")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31759l).name("Abū al Maţāmīr").state(stateRepository.getOne(3241l)).stateCode("BH")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31760l).name("Ad Dilinjāt").state(stateRepository.getOne(3241l)).stateCode("BH")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31761l).name("Ain Sukhna").state(stateRepository.getOne(3233l)).stateCode("SUZ")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31762l).name("Ajā").state(stateRepository.getOne(3245l)).stateCode("DK")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31763l).name("Akhmīm").state(stateRepository.getOne(3226l)).stateCode("SHG")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31764l).name("Al Badārī").state(stateRepository.getOne(3236l)).stateCode("AST")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31765l).name("Al Balyanā").state(stateRepository.getOne(3226l)).stateCode("SHG")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31766l).name("Al Bawīţī").state(stateRepository.getOne(3239l)).stateCode("GZ")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31767l).name("Al Bājūr").state(stateRepository.getOne(3228l)).stateCode("MNF")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31768l).name("Al Fashn").state(stateRepository.getOne(3230l)).stateCode("BNS")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31769l).name("Al Fayyūm").state(stateRepository.getOne(3238l)).stateCode("FYM")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31770l).name("Al Jammālīyah").state(stateRepository.getOne(3245l)).stateCode("DK")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31771l).name("Al Khānkah").state(stateRepository.getOne(3232l)).stateCode("KB")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31772l).name("Al Khārijah").state(stateRepository.getOne(3246l)).stateCode("WAD")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31773l).name("Al Manshāh").state(stateRepository.getOne(3226l)).stateCode("SHG")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31774l).name("Al Manzalah").state(stateRepository.getOne(3245l)).stateCode("DK")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
//        cities.add(City.builder().id(31775l).name("Al Manşūrah").state(stateRepository.getOne(3245l)).stateCode("DK")
//                .country(countryRepository.getOne(65l)).countryCode("EG").latitude(27.26960000).longitude(31.15105000).wikiDataId("Q6655437").build());
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
//                .lecHours(3).labHours(3).description("").program().preCourse().force().build());
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
//                .add(DepartmentDTO.builder().id(1l).nameArabic("عام").nameEnglish("General").code("G").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(2l).nameArabic("علو الحاسب").nameEnglish("Computer Science").code("CS").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(3l).nameArabic("تكنولوجيا المعلومات").nameEnglish("Information Technology").code("IT").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(4l).nameArabic("نظم المعلومات").nameEnglish("Information System").code("IS").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(5l).nameArabic("بحوث العمليات").nameEnglish("Orgnization Research").code("OR").graduationProjectHours(128)
//                        .graduationHours(128).minTerms(4).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(6l).nameArabic("هندسه النظم").nameEnglish("Software Engineering").code("SE").graduationProjectHours(136)
//                        .graduationHours(128).minTerms(8).maxDegreeOnFail(64).build());
//        departmentListDTO.getDepartments()
//                .add(DepartmentDTO.builder().id(7l).nameArabic("الحوسبه والمعلوماتيه الحيويه").nameEnglish("Bioinformatics").code("BIO").graduationProjectHours(136)
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
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
//        programs.add(Program.builder().id().nameArabic("").nameEnglish("").hours().underRequirement().build());
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
//        studentListDTO.getStudents().add(StudentDTO.builder().id().nameArabic().nameEnglish().nationality().gender()
//                .religion().DOB().nationalId().guardianName().email().secSchool().preQualfication().degrees()
//                .studentInfo().user().guide().department().city().build());
//        return studentListDTO;
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
