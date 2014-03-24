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

package org.jetbrains.jet.resolve;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.resolve.AbstractReferenceResolveTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/resolve/references")
@InnerTestClasses({ReferenceResolveTestGenerated.DelegatedPropertyAccessors.class, ReferenceResolveTestGenerated.ForLoopIn.class, ReferenceResolveTestGenerated.Invoke.class})
public class ReferenceResolveTestGenerated extends AbstractReferenceResolveTest {
    public void testAllFilesPresentInReferences() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
    }
    
    @TestMetadata("AnnotationForClass.kt")
    public void testAnnotationForClass() throws Exception {
        doTest("idea/testData/resolve/references/AnnotationForClass.kt");
    }
    
    @TestMetadata("AnnotationInsideFunction.kt")
    public void testAnnotationInsideFunction() throws Exception {
        doTest("idea/testData/resolve/references/AnnotationInsideFunction.kt");
    }
    
    @TestMetadata("AnnotationParameter.kt")
    public void testAnnotationParameter() throws Exception {
        doTest("idea/testData/resolve/references/AnnotationParameter.kt");
    }
    
    @TestMetadata("AnnotationTypeParameter.kt")
    public void testAnnotationTypeParameter() throws Exception {
        doTest("idea/testData/resolve/references/AnnotationTypeParameter.kt");
    }
    
    @TestMetadata("ClassInTypeConstraint.kt")
    public void testClassInTypeConstraint() throws Exception {
        doTest("idea/testData/resolve/references/ClassInTypeConstraint.kt");
    }
    
    @TestMetadata("ClassReferenceInImport.kt")
    public void testClassReferenceInImport() throws Exception {
        doTest("idea/testData/resolve/references/ClassReferenceInImport.kt");
    }
    
    @TestMetadata("CtrlClickResolve.kt")
    public void testCtrlClickResolve() throws Exception {
        doTest("idea/testData/resolve/references/CtrlClickResolve.kt");
    }
    
    @TestMetadata("DontImportRootScope.kt")
    public void testDontImportRootScope() throws Exception {
        doTest("idea/testData/resolve/references/DontImportRootScope.kt");
    }
    
    @TestMetadata("FakeJavaLang1.kt")
    public void testFakeJavaLang1() throws Exception {
        doTest("idea/testData/resolve/references/FakeJavaLang1.kt");
    }
    
    @TestMetadata("FakeJavaLang2.kt")
    public void testFakeJavaLang2() throws Exception {
        doTest("idea/testData/resolve/references/FakeJavaLang2.kt");
    }
    
    @TestMetadata("FakeJavaLang3.kt")
    public void testFakeJavaLang3() throws Exception {
        doTest("idea/testData/resolve/references/FakeJavaLang3.kt");
    }
    
    @TestMetadata("FakeJavaLang4.kt")
    public void testFakeJavaLang4() throws Exception {
        doTest("idea/testData/resolve/references/FakeJavaLang4.kt");
    }
    
    @TestMetadata("GenericFunctionParameter.kt")
    public void testGenericFunctionParameter() throws Exception {
        doTest("idea/testData/resolve/references/GenericFunctionParameter.kt");
    }
    
    @TestMetadata("GenericTypeInFunctionParameter.kt")
    public void testGenericTypeInFunctionParameter() throws Exception {
        doTest("idea/testData/resolve/references/GenericTypeInFunctionParameter.kt");
    }
    
    @TestMetadata("InClassParameter.kt")
    public void testInClassParameter() throws Exception {
        doTest("idea/testData/resolve/references/InClassParameter.kt");
    }
    
    @TestMetadata("InClassParameterField.kt")
    public void testInClassParameterField() throws Exception {
        doTest("idea/testData/resolve/references/InClassParameterField.kt");
    }
    
    @TestMetadata("InFunctionParameterType.kt")
    public void testInFunctionParameterType() throws Exception {
        doTest("idea/testData/resolve/references/InFunctionParameterType.kt");
    }
    
    @TestMetadata("InMethodParameter.kt")
    public void testInMethodParameter() throws Exception {
        doTest("idea/testData/resolve/references/InMethodParameter.kt");
    }
    
    @TestMetadata("InObjectClassObject.kt")
    public void testInObjectClassObject() throws Exception {
        doTest("idea/testData/resolve/references/InObjectClassObject.kt");
    }
    
    @TestMetadata("InSecondClassObject.kt")
    public void testInSecondClassObject() throws Exception {
        doTest("idea/testData/resolve/references/InSecondClassObject.kt");
    }
    
    @TestMetadata("JavaReference.kt")
    public void testJavaReference() throws Exception {
        doTest("idea/testData/resolve/references/JavaReference.kt");
    }
    
    @TestMetadata("MultiDeclarationReference.kt")
    public void testMultiDeclarationReference() throws Exception {
        doTest("idea/testData/resolve/references/MultiDeclarationReference.kt");
    }
    
    @TestMetadata("PackageReference.kt")
    public void testPackageReference() throws Exception {
        doTest("idea/testData/resolve/references/PackageReference.kt");
    }
    
    @TestMetadata("PackageReferenceInImport.kt")
    public void testPackageReferenceInImport() throws Exception {
        doTest("idea/testData/resolve/references/PackageReferenceInImport.kt");
    }
    
    @TestMetadata("PairMultiDeclaration.kt")
    public void testPairMultiDeclaration() throws Exception {
        doTest("idea/testData/resolve/references/PairMultiDeclaration.kt");
    }
    
    @TestMetadata("PropertyPlaceInClassObjectInObject.kt")
    public void testPropertyPlaceInClassObjectInObject() throws Exception {
        doTest("idea/testData/resolve/references/PropertyPlaceInClassObjectInObject.kt");
    }
    
    @TestMetadata("ReferenceInClassWhereConstraint.kt")
    public void testReferenceInClassWhereConstraint() throws Exception {
        doTest("idea/testData/resolve/references/ReferenceInClassWhereConstraint.kt");
    }
    
    @TestMetadata("ReferenceInFunWhereConstraint.kt")
    public void testReferenceInFunWhereConstraint() throws Exception {
        doTest("idea/testData/resolve/references/ReferenceInFunWhereConstraint.kt");
    }
    
    @TestMetadata("ResolveClass.kt")
    public void testResolveClass() throws Exception {
        doTest("idea/testData/resolve/references/ResolveClass.kt");
    }
    
    @TestMetadata("ResolvePackageInProperty.kt")
    public void testResolvePackageInProperty() throws Exception {
        doTest("idea/testData/resolve/references/ResolvePackageInProperty.kt");
    }
    
    @TestMetadata("SamAdapter.kt")
    public void testSamAdapter() throws Exception {
        doTest("idea/testData/resolve/references/SamAdapter.kt");
    }
    
    @TestMetadata("SamConstructor.kt")
    public void testSamConstructor() throws Exception {
        doTest("idea/testData/resolve/references/SamConstructor.kt");
    }
    
    @TestMetadata("SamConstructorTypeArguments.kt")
    public void testSamConstructorTypeArguments() throws Exception {
        doTest("idea/testData/resolve/references/SamConstructorTypeArguments.kt");
    }
    
    @TestMetadata("SeveralOverrides.kt")
    public void testSeveralOverrides() throws Exception {
        doTest("idea/testData/resolve/references/SeveralOverrides.kt");
    }
    
    @TestMetadata("TypeParameterInFunctionLiteral.kt")
    public void testTypeParameterInFunctionLiteral() throws Exception {
        doTest("idea/testData/resolve/references/TypeParameterInFunctionLiteral.kt");
    }
    
    @TestMetadata("idea/testData/resolve/references/delegatedPropertyAccessors")
    @InnerTestClasses({DelegatedPropertyAccessors.InSource.class, DelegatedPropertyAccessors.InStandardLibrary.class})
    public static class DelegatedPropertyAccessors extends AbstractReferenceResolveTest {
        public void testAllFilesPresentInDelegatedPropertyAccessors() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references/delegatedPropertyAccessors"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
        }
        
        @TestMetadata("unresolved.kt")
        public void testUnresolved() throws Exception {
            doTest("idea/testData/resolve/references/delegatedPropertyAccessors/unresolved.kt");
        }
        
        @TestMetadata("idea/testData/resolve/references/delegatedPropertyAccessors/inSource")
        public static class InSource extends AbstractReferenceResolveTest {
            public void testAllFilesPresentInInSource() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references/delegatedPropertyAccessors/inSource"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
            }
            
            @TestMetadata("getExtension.kt")
            public void testGetExtension() throws Exception {
                doTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getExtension.kt");
            }
            
            @TestMetadata("getMember.kt")
            public void testGetMember() throws Exception {
                doTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getMember.kt");
            }
            
            @TestMetadata("getMultipleDeclarations.kt")
            public void testGetMultipleDeclarations() throws Exception {
                doTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getMultipleDeclarations.kt");
            }
            
            @TestMetadata("getOneFakeOverride.kt")
            public void testGetOneFakeOverride() throws Exception {
                doTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getOneFakeOverride.kt");
            }
            
            @TestMetadata("getSetExtension.kt")
            public void testGetSetExtension() throws Exception {
                doTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getSetExtension.kt");
            }
            
            @TestMetadata("getSetMember.kt")
            public void testGetSetMember() throws Exception {
                doTest("idea/testData/resolve/references/delegatedPropertyAccessors/inSource/getSetMember.kt");
            }
            
        }
        
        @TestMetadata("idea/testData/resolve/references/delegatedPropertyAccessors/inStandardLibrary")
        public static class InStandardLibrary extends AbstractReferenceResolveTest {
            public void testAllFilesPresentInInStandardLibrary() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references/delegatedPropertyAccessors/inStandardLibrary"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
            }
            
            @TestMetadata("lazy.kt")
            public void testLazy() throws Exception {
                doTest("idea/testData/resolve/references/delegatedPropertyAccessors/inStandardLibrary/lazy.kt");
            }
            
            @TestMetadata("notNull.kt")
            public void testNotNull() throws Exception {
                doTest("idea/testData/resolve/references/delegatedPropertyAccessors/inStandardLibrary/notNull.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("DelegatedPropertyAccessors");
            suite.addTestSuite(DelegatedPropertyAccessors.class);
            suite.addTestSuite(InSource.class);
            suite.addTestSuite(InStandardLibrary.class);
            return suite;
        }
    }
    
    @TestMetadata("idea/testData/resolve/references/forLoopIn")
    @InnerTestClasses({ForLoopIn.InBuiltIns.class, ForLoopIn.InLibrary.class, ForLoopIn.InSource.class})
    public static class ForLoopIn extends AbstractReferenceResolveTest {
        public void testAllFilesPresentInForLoopIn() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references/forLoopIn"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
        }
        
        @TestMetadata("unresolvedIterator.kt")
        public void testUnresolvedIterator() throws Exception {
            doTest("idea/testData/resolve/references/forLoopIn/unresolvedIterator.kt");
        }
        
        @TestMetadata("idea/testData/resolve/references/forLoopIn/inBuiltIns")
        public static class InBuiltIns extends AbstractReferenceResolveTest {
            public void testAllFilesPresentInInBuiltIns() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references/forLoopIn/inBuiltIns"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
            }
            
            @TestMetadata("extension.kt")
            public void testExtension() throws Exception {
                doTest("idea/testData/resolve/references/forLoopIn/inBuiltIns/extension.kt");
            }
            
            @TestMetadata("member.kt")
            public void testMember() throws Exception {
                doTest("idea/testData/resolve/references/forLoopIn/inBuiltIns/member.kt");
            }
            
        }
        
        @TestMetadata("idea/testData/resolve/references/forLoopIn/inLibrary")
        public static class InLibrary extends AbstractReferenceResolveTest {
            public void testAllFilesPresentInInLibrary() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references/forLoopIn/inLibrary"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
            }
            
            @TestMetadata("extension.kt")
            public void testExtension() throws Exception {
                doTest("idea/testData/resolve/references/forLoopIn/inLibrary/extension.kt");
            }
            
        }
        
        @TestMetadata("idea/testData/resolve/references/forLoopIn/inSource")
        public static class InSource extends AbstractReferenceResolveTest {
            @TestMetadata("allExtensions.kt")
            public void testAllExtensions() throws Exception {
                doTest("idea/testData/resolve/references/forLoopIn/inSource/allExtensions.kt");
            }
            
            public void testAllFilesPresentInInSource() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references/forLoopIn/inSource"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
            }
            
            @TestMetadata("allMembers.kt")
            public void testAllMembers() throws Exception {
                doTest("idea/testData/resolve/references/forLoopIn/inSource/allMembers.kt");
            }
            
            @TestMetadata("nextMissing.kt")
            public void testNextMissing() throws Exception {
                doTest("idea/testData/resolve/references/forLoopIn/inSource/nextMissing.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("ForLoopIn");
            suite.addTestSuite(ForLoopIn.class);
            suite.addTestSuite(InBuiltIns.class);
            suite.addTestSuite(InLibrary.class);
            suite.addTestSuite(InSource.class);
            return suite;
        }
    }
    
    @TestMetadata("idea/testData/resolve/references/invoke")
    public static class Invoke extends AbstractReferenceResolveTest {
        public void testAllFilesPresentInInvoke() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/resolve/references/invoke"), Pattern.compile("^([^\\.]+)\\.kt$"), true);
        }
        
        @TestMetadata("lambdaAndParens.kt")
        public void testLambdaAndParens() throws Exception {
            doTest("idea/testData/resolve/references/invoke/lambdaAndParens.kt");
        }
        
        @TestMetadata("lambdaNoPar.kt")
        public void testLambdaNoPar() throws Exception {
            doTest("idea/testData/resolve/references/invoke/lambdaNoPar.kt");
        }
        
        @TestMetadata("lambdaNoParLabel.kt")
        public void testLambdaNoParLabel() throws Exception {
            doTest("idea/testData/resolve/references/invoke/lambdaNoParLabel.kt");
        }
        
        @TestMetadata("lambdaNoParRCurly.kt")
        public void testLambdaNoParRCurly() throws Exception {
            doTest("idea/testData/resolve/references/invoke/lambdaNoParRCurly.kt");
        }
        
        @TestMetadata("noParams.kt")
        public void testNoParams() throws Exception {
            doTest("idea/testData/resolve/references/invoke/noParams.kt");
        }
        
        @TestMetadata("noParamsRPar.kt")
        public void testNoParamsRPar() throws Exception {
            doTest("idea/testData/resolve/references/invoke/noParamsRPar.kt");
        }
        
        @TestMetadata("nonemptyLambdaRPar.kt")
        public void testNonemptyLambdaRPar() throws Exception {
            doTest("idea/testData/resolve/references/invoke/nonemptyLambdaRPar.kt");
        }
        
        @TestMetadata("oneParam.kt")
        public void testOneParam() throws Exception {
            doTest("idea/testData/resolve/references/invoke/oneParam.kt");
        }
        
        @TestMetadata("oneParamRPar.kt")
        public void testOneParamRPar() throws Exception {
            doTest("idea/testData/resolve/references/invoke/oneParamRPar.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("ReferenceResolveTestGenerated");
        suite.addTestSuite(ReferenceResolveTestGenerated.class);
        suite.addTest(DelegatedPropertyAccessors.innerSuite());
        suite.addTest(ForLoopIn.innerSuite());
        suite.addTestSuite(Invoke.class);
        return suite;
    }
}