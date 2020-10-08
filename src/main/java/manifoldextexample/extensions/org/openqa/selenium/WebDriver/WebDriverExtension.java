package manifoldextexample.extensions.org.openqa.selenium.WebDriver;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import org.openqa.selenium.WebDriver;

@Extension
public class WebDriverExtension {
  public static void helloWorld(@This WebDriver thiz) {
    System.out.println("hello world!");
  }
}