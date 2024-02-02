package hu.kalee;

import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.modulith.ApplicationModule;
import org.springframework.modulith.core.ApplicationModuleDetectionStrategy;
import org.springframework.modulith.core.JavaPackage;

/**
 * Processes all the packages from base package 
 *  and considers them application modules
 *  if and only if they are annotated with @ApplicationModule.
 */
public class AnnotationBasedApplicationModuleDetectionStrategy implements ApplicationModuleDetectionStrategy {
  @Override
  public Stream<JavaPackage> getModuleBasePackages(JavaPackage basePackage) {
    return basePackage.getSubPackagesAnnotatedWith(ApplicationModule.class);
  }
}
