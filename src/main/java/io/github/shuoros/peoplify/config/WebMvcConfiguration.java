package io.github.shuoros.peoplify.config;

import io.github.shuoros.peoplify.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {

    @Autowired
    private AvatarTypeConverter avatarTypeConverter;

    @Autowired
    private GenderConverter genderConverter;

    @Autowired
    private LanguageConverter languageConverter;

    @Autowired
    private BodyColorConverter bodyColorConverter;

    @Autowired
    private FaceExpressionConverter faceExpressionConverter;

    @Autowired
    private HairTypeConverter hairTypeConverter;

    @Autowired
    private BeardTypeConverter beardTypeConverter;

    @Autowired
    private HairColorConverter hairColorConverter;

    @Autowired
    private ClothColorConverter clothColorConverter;

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(avatarTypeConverter);
        registry.addConverter(genderConverter);
        registry.addConverter(languageConverter);
        registry.addConverter(bodyColorConverter);
        registry.addConverter(faceExpressionConverter);
        registry.addConverter(hairTypeConverter);
        registry.addConverter(beardTypeConverter);
        registry.addConverter(hairColorConverter);
        registry.addConverter(clothColorConverter);
    }
}
