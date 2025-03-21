/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 16 08:37:17 GMT 2025
 */

package maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;


import maven.Money;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;





@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Money_ESTest extends Money_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Money money0 = new Money(0, "maven.Money");
      Money money1 = new Money(870, "maven.Money");
      boolean boolean0 = money0.equals(money1);
      assertFalse(boolean0);
      assertEquals(870, money1.getAmount());
      assertFalse(money1.equals((Object)money0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Money money0 = new Money(2005, "&l:I&O/c5(xu*");
      money0.getCurrency();
      assertEquals(2005, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Money money0 = new Money(0, "");
      money0.getCurrency();
      assertEquals(0, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Money money0 = new Money(2005, "&l:I&O/c5(xu*");
      int int0 = money0.getAmount();
      assertEquals(2005, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Money money0 = new Money((-1), "!yQtG_`");
      int int0 = money0.getAmount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Money money0 = new Money(2005, "&l:I&O/c5(xu*");
      Money money1 = money0.add(money0);
      assertEquals(2005, money0.getAmount());
      assertEquals(4010, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Money money0 = new Money(2005, "&l:I&O/c5(xu*");
      // Undeclared exception!
      try { 
        money0.add((Money) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("maven.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Money money0 = new Money(0, (String) null);
      money0.getCurrency();
      assertEquals(0, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Money money0 = new Money(0, (String) null);
      int int0 = money0.getAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Money money0 = new Money(0, "");
      boolean boolean0 = money0.equals(money0);
      assertTrue(boolean0);
      assertEquals(0, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Money money0 = new Money((-659), "DZ%-0q=gBR/");
      Money money1 = new Money((-659), "DZ%-0q=fBR/");
      boolean boolean0 = money0.equals(money1);
      assertFalse(boolean0);
      assertEquals((-659), money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Money money0 = new Money((-659), "DZ%-0q=gBR/");
      Money money1 = money0.add(money0);
      boolean boolean0 = money0.equals(money1);
      assertEquals((-659), money0.getAmount());
      assertFalse(money1.equals((Object)money0));
      assertFalse(boolean0);
      assertEquals((-1318), money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Money money0 = new Money(1, "[(A} G AsO?a;([:$q");
      boolean boolean0 = money0.equals("[(A} G AsO?a;([:$q");
      assertEquals(1, money0.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Money money0 = new Money(0, (String) null);
      // Undeclared exception!
      try { 
        money0.equals(money0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Money money0 = new Money(0, (String) null);
      Money money1 = money0.add(money0);
      assertEquals(0, money1.getAmount());
  }
}
