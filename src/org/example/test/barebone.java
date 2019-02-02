// put copy of com/jsoftware/j folder into your source code tree

package org.example.test;

import com.jsoftware.j.JInterface;

public class barebone
{

// define full paths to J bin folder, shared library, and profile

// typical for linux/macos install in home (dylib instead of so for macos)
// static String libjDir="/home/bill/j64-807/bin";
// static String libj="libj.so";
// static String jprofile="/home/bill/j64-807/bin/profile.ijs";
// static String BINPATH="/home/bill/j64-807/bin";

// typical for debian install
  static String libjDir="";  // no need to set
  static String libj="libj.so.8.07";
  static String jprofile="/etc/j/8.07/profile.ijs";
  static String BINPATH="/usr/bin";

// typical for windows install in home
// static String libjDir="/users/bill/j64-807/bin";
// static String libj="j.dll";
// static String jprofile="/users/bill/j64-807/bin/profile.ijs";
// static String BINPATH="/users/bill/j64-807/bin";

  public static void main(String[] args)
  {

// J boot up and load profile
// libjnative.so/jnative.dll must in lib path

    JInterface.libjDir=libjDir;
    JInterface.libj=libj;
    JInterface jInterface = new JInterface();

// not load any profile

// your stuff here

// reverse a string
    System.out.println(jInterface.dors("|.'abcde'"));

  }

}
