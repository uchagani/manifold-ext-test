package manifoldextexample.extensions.java.lang.String;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.This;
import java.lang.String;

@Extension
public class StringExtension {
  public static String removeSpaces(@This String thiz) {
    return thiz.replace(" ", "");
  }
}