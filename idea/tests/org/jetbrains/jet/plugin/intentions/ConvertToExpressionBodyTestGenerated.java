/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.plugin.intentions;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.intentions.AbstractIntentionTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/intentions/convertToExpressionBody")
public class ConvertToExpressionBodyTestGenerated extends AbstractIntentionTest {
    public void testAllFilesPresentInConvertToExpressionBody() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/intentions/convertToExpressionBody"), Pattern.compile("^before(\\w+)\\.kt$"), true);
    }
    
    @TestMetadata("beforeAnonymousObjectExpression.kt")
    public void testAnonymousObjectExpression() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeAnonymousObjectExpression.kt");
    }
    
    @TestMetadata("beforeAssignment.kt")
    public void testAssignment() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeAssignment.kt");
    }
    
    @TestMetadata("beforeDeclaration.kt")
    public void testDeclaration() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeDeclaration.kt");
    }
    
    @TestMetadata("beforeExpressionWithReturns1.kt")
    public void testExpressionWithReturns1() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeExpressionWithReturns1.kt");
    }
    
    @TestMetadata("beforeExpressionWithReturns2.kt")
    public void testExpressionWithReturns2() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeExpressionWithReturns2.kt");
    }
    
    @TestMetadata("beforeFunWithImplicitUnitTypeWithThrow.kt")
    public void testFunWithImplicitUnitTypeWithThrow() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeFunWithImplicitUnitTypeWithThrow.kt");
    }
    
    @TestMetadata("beforeFunWithNoBlock.kt")
    public void testFunWithNoBlock() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeFunWithNoBlock.kt");
    }
    
    @TestMetadata("beforeFunWithNothingType.kt")
    public void testFunWithNothingType() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeFunWithNothingType.kt");
    }
    
    @TestMetadata("beforeFunWithReturn.kt")
    public void testFunWithReturn() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeFunWithReturn.kt");
    }
    
    @TestMetadata("beforeFunWithUnitType.kt")
    public void testFunWithUnitType() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeFunWithUnitType.kt");
    }
    
    @TestMetadata("beforeFunWithUnitType2.kt")
    public void testFunWithUnitType2() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeFunWithUnitType2.kt");
    }
    
    @TestMetadata("beforeFunWithUnitTypeWithThrow.kt")
    public void testFunWithUnitTypeWithThrow() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeFunWithUnitTypeWithThrow.kt");
    }
    
    @TestMetadata("beforeFunctionLiteral.kt")
    public void testFunctionLiteral() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeFunctionLiteral.kt");
    }
    
    @TestMetadata("beforeGetWithReturn.kt")
    public void testGetWithReturn() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeGetWithReturn.kt");
    }
    
    @TestMetadata("beforeMultipleStatements.kt")
    public void testMultipleStatements() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeMultipleStatements.kt");
    }
    
    @TestMetadata("beforeReturnWithNoValue.kt")
    public void testReturnWithNoValue() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeReturnWithNoValue.kt");
    }
    
    @TestMetadata("beforeWhile.kt")
    public void testWhile() throws Exception {
        doTest("idea/testData/intentions/convertToExpressionBody/beforeWhile.kt");
    }
    
}