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

package org.jetbrains.jet.plugin.stubs;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.stubs.AbstractStubBuilderTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/stubs")
public class StubBuilderTestGenerated extends AbstractStubBuilderTest {
    public void testAllFilesPresentInStubs() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/stubs"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("AnnotationClass.kt")
    public void testAnnotationClass() throws Exception {
        doTest("idea/testData/stubs/AnnotationClass.kt");
    }
    
    @TestMetadata("AnnotationOnClass.kt")
    public void testAnnotationOnClass() throws Exception {
        doTest("idea/testData/stubs/AnnotationOnClass.kt");
    }
    
    @TestMetadata("AnnotationOnFunction.kt")
    public void testAnnotationOnFunction() throws Exception {
        doTest("idea/testData/stubs/AnnotationOnFunction.kt");
    }
    
    @TestMetadata("AnnotationOnLocalFunction.kt")
    public void testAnnotationOnLocalFunction() throws Exception {
        doTest("idea/testData/stubs/AnnotationOnLocalFunction.kt");
    }
    
    @TestMetadata("AnonymousObject.kt")
    public void testAnonymousObject() throws Exception {
        doTest("idea/testData/stubs/AnonymousObject.kt");
    }
    
    @TestMetadata("ClassObject.kt")
    public void testClassObject() throws Exception {
        doTest("idea/testData/stubs/ClassObject.kt");
    }
    
    @TestMetadata("ClassProperty.kt")
    public void testClassProperty() throws Exception {
        doTest("idea/testData/stubs/ClassProperty.kt");
    }
    
    @TestMetadata("ClassTypeParameters.kt")
    public void testClassTypeParameters() throws Exception {
        doTest("idea/testData/stubs/ClassTypeParameters.kt");
    }
    
    @TestMetadata("FilePackage.kt")
    public void testFilePackage() throws Exception {
        doTest("idea/testData/stubs/FilePackage.kt");
    }
    
    @TestMetadata("FunctionInNotNamedObject.kt")
    public void testFunctionInNotNamedObject() throws Exception {
        doTest("idea/testData/stubs/FunctionInNotNamedObject.kt");
    }
    
    @TestMetadata("FunctionParameters.kt")
    public void testFunctionParameters() throws Exception {
        doTest("idea/testData/stubs/FunctionParameters.kt");
    }
    
    @TestMetadata("InnerClass.kt")
    public void testInnerClass() throws Exception {
        doTest("idea/testData/stubs/InnerClass.kt");
    }
    
    @TestMetadata("LocalClass.kt")
    public void testLocalClass() throws Exception {
        doTest("idea/testData/stubs/LocalClass.kt");
    }
    
    @TestMetadata("LocalClassInLocalFunction.kt")
    public void testLocalClassInLocalFunction() throws Exception {
        doTest("idea/testData/stubs/LocalClassInLocalFunction.kt");
    }
    
    @TestMetadata("LocalNamedObject.kt")
    public void testLocalNamedObject() throws Exception {
        doTest("idea/testData/stubs/LocalNamedObject.kt");
    }
    
    @TestMetadata("ManyAnnotationsOnFunction.kt")
    public void testManyAnnotationsOnFunction() throws Exception {
        doTest("idea/testData/stubs/ManyAnnotationsOnFunction.kt");
    }
    
    @TestMetadata("MembersInLocalClass.kt")
    public void testMembersInLocalClass() throws Exception {
        doTest("idea/testData/stubs/MembersInLocalClass.kt");
    }
    
    @TestMetadata("MembersInLocalObject.kt")
    public void testMembersInLocalObject() throws Exception {
        doTest("idea/testData/stubs/MembersInLocalObject.kt");
    }
    
    @TestMetadata("NamedObject.kt")
    public void testNamedObject() throws Exception {
        doTest("idea/testData/stubs/NamedObject.kt");
    }
    
    @TestMetadata("NotStorePropertiesFrom.kt")
    public void testNotStorePropertiesFrom() throws Exception {
        doTest("idea/testData/stubs/NotStorePropertiesFrom.kt");
    }
    
    @TestMetadata("NotStorePropertyFromDelegate.kt")
    public void testNotStorePropertyFromDelegate() throws Exception {
        doTest("idea/testData/stubs/NotStorePropertyFromDelegate.kt");
    }
    
    @TestMetadata("NotStorePropertyFromInitializer.kt")
    public void testNotStorePropertyFromInitializer() throws Exception {
        doTest("idea/testData/stubs/NotStorePropertyFromInitializer.kt");
    }
    
    @TestMetadata("ObjectInInitializer.kt")
    public void testObjectInInitializer() throws Exception {
        doTest("idea/testData/stubs/ObjectInInitializer.kt");
    }
    
    @TestMetadata("ObjectInPropertyDelegate.kt")
    public void testObjectInPropertyDelegate() throws Exception {
        doTest("idea/testData/stubs/ObjectInPropertyDelegate.kt");
    }
    
    @TestMetadata("PackageProperty.kt")
    public void testPackageProperty() throws Exception {
        doTest("idea/testData/stubs/PackageProperty.kt");
    }
    
    @TestMetadata("ParametersWithFqName.kt")
    public void testParametersWithFqName() throws Exception {
        doTest("idea/testData/stubs/ParametersWithFqName.kt");
    }
    
    @TestMetadata("PropertyAsPropertyInitalizerInvalidCode.kt")
    public void testPropertyAsPropertyInitalizerInvalidCode() throws Exception {
        doTest("idea/testData/stubs/PropertyAsPropertyInitalizerInvalidCode.kt");
    }
    
    @TestMetadata("QualifiedAnnotationOnFunction.kt")
    public void testQualifiedAnnotationOnFunction() throws Exception {
        doTest("idea/testData/stubs/QualifiedAnnotationOnFunction.kt");
    }
    
    @TestMetadata("SimpleEnumBuild.kt")
    public void testSimpleEnumBuild() throws Exception {
        doTest("idea/testData/stubs/SimpleEnumBuild.kt");
    }
    
}
