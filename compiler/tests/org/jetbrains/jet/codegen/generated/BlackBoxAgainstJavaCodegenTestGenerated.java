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

package org.jetbrains.jet.codegen.generated;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.codegen.generated.AbstractBlackBoxCodegenTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxAgainstJava")
@InnerTestClasses({BlackBoxAgainstJavaCodegenTestGenerated.Annotations.class, BlackBoxAgainstJavaCodegenTestGenerated.CallableReference.class, BlackBoxAgainstJavaCodegenTestGenerated.Constructor.class, BlackBoxAgainstJavaCodegenTestGenerated.Delegation.class, BlackBoxAgainstJavaCodegenTestGenerated.Enum.class, BlackBoxAgainstJavaCodegenTestGenerated.Functions.class, BlackBoxAgainstJavaCodegenTestGenerated.InnerClass.class, BlackBoxAgainstJavaCodegenTestGenerated.Property.class, BlackBoxAgainstJavaCodegenTestGenerated.Reflection.class, BlackBoxAgainstJavaCodegenTestGenerated.Sam.class, BlackBoxAgainstJavaCodegenTestGenerated.StaticFun.class, BlackBoxAgainstJavaCodegenTestGenerated.Visibility.class})
public class BlackBoxAgainstJavaCodegenTestGenerated extends AbstractBlackBoxCodegenTest {
    public void testAllFilesPresentInBoxAgainstJava() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava"), Pattern.compile("^(.+)\\.kt$"), true);
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/annotations")
    public static class Annotations extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInAnnotations() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/annotations"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("javaAnnotationCall.kt")
        public void testJavaAnnotationCall() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/annotations/javaAnnotationCall.kt");
        }
        
        @TestMetadata("javaAnnotationDefault.kt")
        public void testJavaAnnotationDefault() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/annotations/javaAnnotationDefault.kt");
        }
        
        @TestMetadata("javaNegativePropertyAsAnnotationParameter.kt")
        public void testJavaNegativePropertyAsAnnotationParameter() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/annotations/javaNegativePropertyAsAnnotationParameter.kt");
        }
        
        @TestMetadata("javaPropertyAsAnnotationParameter.kt")
        public void testJavaPropertyAsAnnotationParameter() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/annotations/javaPropertyAsAnnotationParameter.kt");
        }
        
        @TestMetadata("javaPropertyWithIntInitializer.kt")
        public void testJavaPropertyWithIntInitializer() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/annotations/javaPropertyWithIntInitializer.kt");
        }
        
        @TestMetadata("retentionInJava.kt")
        public void testRetentionInJava() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/annotations/retentionInJava.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/callableReference")
    public static class CallableReference extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInCallableReference() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/callableReference"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("constructor.kt")
        public void testConstructor() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/callableReference/constructor.kt");
        }
        
        @TestMetadata("publicFinalField.kt")
        public void testPublicFinalField() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/callableReference/publicFinalField.kt");
        }
        
        @TestMetadata("publicMutableField.kt")
        public void testPublicMutableField() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/callableReference/publicMutableField.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/constructor")
    public static class Constructor extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInConstructor() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/constructor"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("genericConstructor.kt")
        public void testGenericConstructor() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/constructor/genericConstructor.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/delegation")
    public static class Delegation extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInDelegation() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/delegation"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("delegationAndInheritanceFromJava.kt")
        public void testDelegationAndInheritanceFromJava() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/delegation/delegationAndInheritanceFromJava.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/enum")
    public static class Enum extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInEnum() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/enum"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("simpleJavaEnum.kt")
        public void testSimpleJavaEnum() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/enum/simpleJavaEnum.kt");
        }
        
        @TestMetadata("simpleJavaEnumWithFunction.kt")
        public void testSimpleJavaEnumWithFunction() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/enum/simpleJavaEnumWithFunction.kt");
        }
        
        @TestMetadata("simpleJavaEnumWithStaticImport.kt")
        public void testSimpleJavaEnumWithStaticImport() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/enum/simpleJavaEnumWithStaticImport.kt");
        }
        
        @TestMetadata("simpleJavaInnerEnum.kt")
        public void testSimpleJavaInnerEnum() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/enum/simpleJavaInnerEnum.kt");
        }
        
        @TestMetadata("staticField.kt")
        public void testStaticField() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/enum/staticField.kt");
        }
        
        @TestMetadata("staticMethod.kt")
        public void testStaticMethod() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/enum/staticMethod.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/functions")
    public static class Functions extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInFunctions() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/functions"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("constructor.kt")
        public void testConstructor() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/functions/constructor.kt");
        }
        
        @TestMetadata("max.kt")
        public void testMax() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/functions/max.kt");
        }
        
        @TestMetadata("referencesStaticInnerClassMethod.kt")
        public void testReferencesStaticInnerClassMethod() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/functions/referencesStaticInnerClassMethod.kt");
        }
        
        @TestMetadata("referencesStaticInnerClassMethodL2.kt")
        public void testReferencesStaticInnerClassMethodL2() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/functions/referencesStaticInnerClassMethodL2.kt");
        }
        
        @TestMetadata("unrelatedUpperBounds.kt")
        public void testUnrelatedUpperBounds() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/functions/unrelatedUpperBounds.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/innerClass")
    public static class InnerClass extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInInnerClass() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/innerClass"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("kt3532.kt")
        public void testKt3532() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/innerClass/kt3532.kt");
        }
        
        @TestMetadata("kt3812.kt")
        public void testKt3812() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/innerClass/kt3812.kt");
        }
        
        @TestMetadata("kt4036.kt")
        public void testKt4036() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/innerClass/kt4036.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/property")
    public static class Property extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInProperty() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/property"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("fieldAccessFromExtensionInTraitImpl.kt")
        public void testFieldAccessFromExtensionInTraitImpl() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/property/fieldAccessFromExtensionInTraitImpl.kt");
        }
        
        @TestMetadata("fieldAccessViaSubclass.kt")
        public void testFieldAccessViaSubclass() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/property/fieldAccessViaSubclass.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/reflection")
    @InnerTestClasses({Reflection.Mapping.class})
    public static class Reflection extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInReflection() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/reflection"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("compiler/testData/codegen/boxAgainstJava/reflection/mapping")
        public static class Mapping extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInMapping() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/reflection/mapping"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("jClass2kClass.kt")
            public void testJClass2kClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/reflection/mapping/jClass2kClass.kt");
            }
            
            @TestMetadata("javaFields.kt")
            public void testJavaFields() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/reflection/mapping/javaFields.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Reflection");
            suite.addTestSuite(Reflection.class);
            suite.addTestSuite(Mapping.class);
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/sam")
    @InnerTestClasses({Sam.Adapters.class})
    public static class Sam extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInSam() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/sam"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("differentFqNames.kt")
        public void testDifferentFqNames() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/differentFqNames.kt");
        }
        
        @TestMetadata("samConstructorGenericSignature.kt")
        public void testSamConstructorGenericSignature() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/samConstructorGenericSignature.kt");
        }
        
        @TestMetadata("compiler/testData/codegen/boxAgainstJava/sam/adapters")
        @InnerTestClasses({Adapters.Operators.class})
        public static class Adapters extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInAdapters() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/sam/adapters"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("callAbstractAdapter.kt")
            public void testCallAbstractAdapter() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/callAbstractAdapter.kt");
            }
            
            @TestMetadata("comparator.kt")
            public void testComparator() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/comparator.kt");
            }
            
            @TestMetadata("constructor.kt")
            public void testConstructor() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/constructor.kt");
            }
            
            @TestMetadata("fileFilter.kt")
            public void testFileFilter() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/fileFilter.kt");
            }
            
            @TestMetadata("genericSignature.kt")
            public void testGenericSignature() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/genericSignature.kt");
            }
            
            @TestMetadata("implementAdapter.kt")
            public void testImplementAdapter() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/implementAdapter.kt");
            }
            
            @TestMetadata("inheritedInKotlin.kt")
            public void testInheritedInKotlin() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/inheritedInKotlin.kt");
            }
            
            @TestMetadata("inheritedOverriddenAdapter.kt")
            public void testInheritedOverriddenAdapter() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/inheritedOverriddenAdapter.kt");
            }
            
            @TestMetadata("inheritedSimple.kt")
            public void testInheritedSimple() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/inheritedSimple.kt");
            }
            
            @TestMetadata("nonLiteralAndLiteralRunnable.kt")
            public void testNonLiteralAndLiteralRunnable() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/nonLiteralAndLiteralRunnable.kt");
            }
            
            @TestMetadata("nonLiteralComparator.kt")
            public void testNonLiteralComparator() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/nonLiteralComparator.kt");
            }
            
            @TestMetadata("nonLiteralInConstructor.kt")
            public void testNonLiteralInConstructor() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/nonLiteralInConstructor.kt");
            }
            
            @TestMetadata("nonLiteralNull.kt")
            public void testNonLiteralNull() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/nonLiteralNull.kt");
            }
            
            @TestMetadata("nonLiteralRunnable.kt")
            public void testNonLiteralRunnable() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/nonLiteralRunnable.kt");
            }
            
            @TestMetadata("severalSamParameters.kt")
            public void testSeveralSamParameters() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/severalSamParameters.kt");
            }
            
            @TestMetadata("simplest.kt")
            public void testSimplest() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/simplest.kt");
            }
            
            @TestMetadata("superconstructor.kt")
            public void testSuperconstructor() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/superconstructor.kt");
            }
            
            @TestMetadata("typeParameterOfClass.kt")
            public void testTypeParameterOfClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/typeParameterOfClass.kt");
            }
            
            @TestMetadata("typeParameterOfMethod.kt")
            public void testTypeParameterOfMethod() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/typeParameterOfMethod.kt");
            }
            
            @TestMetadata("typeParameterOfOuterClass.kt")
            public void testTypeParameterOfOuterClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/typeParameterOfOuterClass.kt");
            }
            
            @TestMetadata("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators")
            public static class Operators extends AbstractBlackBoxCodegenTest {
                public void testAllFilesPresentInOperators() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("augmentedAssignmentAndSquareBrackets.kt")
                public void testAugmentedAssignmentAndSquareBrackets() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/augmentedAssignmentAndSquareBrackets.kt");
                }
                
                @TestMetadata("augmentedAssignmentPure.kt")
                public void testAugmentedAssignmentPure() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/augmentedAssignmentPure.kt");
                }
                
                @TestMetadata("augmentedAssignmentViaSimpleBinary.kt")
                public void testAugmentedAssignmentViaSimpleBinary() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/augmentedAssignmentViaSimpleBinary.kt");
                }
                
                @TestMetadata("binary.kt")
                public void testBinary() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/binary.kt");
                }
                
                @TestMetadata("compareTo.kt")
                public void testCompareTo() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/compareTo.kt");
                }
                
                @TestMetadata("contains.kt")
                public void testContains() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/contains.kt");
                }
                
                @TestMetadata("get.kt")
                public void testGet() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/get.kt");
                }
                
                @TestMetadata("infixCall.kt")
                public void testInfixCall() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/infixCall.kt");
                }
                
                @TestMetadata("invoke.kt")
                public void testInvoke() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/invoke.kt");
                }
                
                @TestMetadata("multiGetSet.kt")
                public void testMultiGetSet() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/multiGetSet.kt");
                }
                
                @TestMetadata("multiInvoke.kt")
                public void testMultiInvoke() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/multiInvoke.kt");
                }
                
                @TestMetadata("set.kt")
                public void testSet() throws Exception {
                    doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/sam/adapters/operators/set.kt");
                }
                
            }
            
            public static Test innerSuite() {
                TestSuite suite = new TestSuite("Adapters");
                suite.addTestSuite(Adapters.class);
                suite.addTestSuite(Operators.class);
                return suite;
            }
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Sam");
            suite.addTestSuite(Sam.class);
            suite.addTest(Adapters.innerSuite());
            return suite;
        }
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/staticFun")
    public static class StaticFun extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInStaticFun() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/staticFun"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("classWithNestedEnum.kt")
        public void testClassWithNestedEnum() throws Exception {
            doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/staticFun/classWithNestedEnum.kt");
        }
        
    }
    
    @TestMetadata("compiler/testData/codegen/boxAgainstJava/visibility")
    @InnerTestClasses({Visibility.Package.class, Visibility.ProtectedAndPackage.class, Visibility.ProtectedStatic.class})
    public static class Visibility extends AbstractBlackBoxCodegenTest {
        public void testAllFilesPresentInVisibility() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/visibility"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("compiler/testData/codegen/boxAgainstJava/visibility/package")
        public static class Package extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInPackage() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/visibility/package"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("kt2781.kt")
            public void testKt2781() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/package/kt2781.kt");
            }
            
            @TestMetadata("packageClass.kt")
            public void testPackageClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/package/packageClass.kt");
            }
            
            @TestMetadata("packageFun.kt")
            public void testPackageFun() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/package/packageFun.kt");
            }
            
            @TestMetadata("packageProperty.kt")
            public void testPackageProperty() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/package/packageProperty.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/codegen/boxAgainstJava/visibility/protectedAndPackage")
        public static class ProtectedAndPackage extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInProtectedAndPackage() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/visibility/protectedAndPackage"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("overrideProtectedFunInPackage.kt")
            public void testOverrideProtectedFunInPackage() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedAndPackage/overrideProtectedFunInPackage.kt");
            }
            
            @TestMetadata("protectedFunInPackage.kt")
            public void testProtectedFunInPackage() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedAndPackage/protectedFunInPackage.kt");
            }
            
            @TestMetadata("protectedPropertyInPackage.kt")
            public void testProtectedPropertyInPackage() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedAndPackage/protectedPropertyInPackage.kt");
            }
            
            @TestMetadata("protectedStaticClass.kt")
            public void testProtectedStaticClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedAndPackage/protectedStaticClass.kt");
            }
            
        }
        
        @TestMetadata("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic")
        public static class ProtectedStatic extends AbstractBlackBoxCodegenTest {
            public void testAllFilesPresentInProtectedStatic() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("funCallInConstructor.kt")
            public void testFunCallInConstructor() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/funCallInConstructor.kt");
            }
            
            @TestMetadata("funClassObject.kt")
            public void testFunClassObject() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/funClassObject.kt");
            }
            
            @TestMetadata("funGenericClass.kt")
            public void testFunGenericClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/funGenericClass.kt");
            }
            
            @TestMetadata("funNestedStaticClass.kt")
            public void testFunNestedStaticClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/funNestedStaticClass.kt");
            }
            
            @TestMetadata("funNestedStaticClass2.kt")
            public void testFunNestedStaticClass2() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/funNestedStaticClass2.kt");
            }
            
            @TestMetadata("funNestedStaticGenericClass.kt")
            public void testFunNestedStaticGenericClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/funNestedStaticGenericClass.kt");
            }
            
            @TestMetadata("funNotDirectSuperClass.kt")
            public void testFunNotDirectSuperClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/funNotDirectSuperClass.kt");
            }
            
            @TestMetadata("funObject.kt")
            public void testFunObject() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/funObject.kt");
            }
            
            @TestMetadata("simpleClass.kt")
            public void testSimpleClass() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/simpleClass.kt");
            }
            
            @TestMetadata("simpleClass2.kt")
            public void testSimpleClass2() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/simpleClass2.kt");
            }
            
            @TestMetadata("simpleFun.kt")
            public void testSimpleFun() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/simpleFun.kt");
            }
            
            @TestMetadata("simpleProperty.kt")
            public void testSimpleProperty() throws Exception {
                doTestAgainstJava("compiler/testData/codegen/boxAgainstJava/visibility/protectedStatic/simpleProperty.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Visibility");
            suite.addTestSuite(Visibility.class);
            suite.addTestSuite(Package.class);
            suite.addTestSuite(ProtectedAndPackage.class);
            suite.addTestSuite(ProtectedStatic.class);
            return suite;
        }
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("BlackBoxAgainstJavaCodegenTestGenerated");
        suite.addTestSuite(BlackBoxAgainstJavaCodegenTestGenerated.class);
        suite.addTestSuite(Annotations.class);
        suite.addTestSuite(CallableReference.class);
        suite.addTestSuite(Constructor.class);
        suite.addTestSuite(Delegation.class);
        suite.addTestSuite(Enum.class);
        suite.addTestSuite(Functions.class);
        suite.addTestSuite(InnerClass.class);
        suite.addTestSuite(Property.class);
        suite.addTest(Reflection.innerSuite());
        suite.addTest(Sam.innerSuite());
        suite.addTestSuite(StaticFun.class);
        suite.addTest(Visibility.innerSuite());
        return suite;
    }
}
