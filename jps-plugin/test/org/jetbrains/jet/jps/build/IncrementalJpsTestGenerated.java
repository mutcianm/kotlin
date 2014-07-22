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

package org.jetbrains.jet.jps.build;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.jps.build.AbstractIncrementalJpsTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("jps-plugin/testData/incremental")
@InnerTestClasses({IncrementalJpsTestGenerated.PureKotlin.class})
public class IncrementalJpsTestGenerated extends AbstractIncrementalJpsTest {
    public void testAllFilesPresentInIncremental() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("jps-plugin/testData/incremental"), Pattern.compile("^([^\\.]+)$"), true);
    }
    
    @TestMetadata("jps-plugin/testData/incremental/pureKotlin")
    @InnerTestClasses({})
    public static class PureKotlin extends AbstractIncrementalJpsTest {
        @TestMetadata("accessingFunctionsViaPackagePart")
        public void testAccessingFunctionsViaPackagePart() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/accessingFunctionsViaPackagePart/");
        }
        
        @TestMetadata("accessingPropertiesViaField")
        public void testAccessingPropertiesViaField() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/accessingPropertiesViaField/");
        }
        
        @TestMetadata("allConstants")
        public void testAllConstants() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/allConstants/");
        }
        
        public void testAllFilesPresentInPureKotlin() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("jps-plugin/testData/incremental/pureKotlin"), Pattern.compile("^([^\\.]+)$"), true);
        }
        
        @TestMetadata("annotations")
        public void testAnnotations() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/annotations/");
        }
        
        @TestMetadata("classInlineFunctionChanged")
        public void testClassInlineFunctionChanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/classInlineFunctionChanged/");
        }
        
        @TestMetadata("classObjectConstantChanged")
        public void testClassObjectConstantChanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/classObjectConstantChanged/");
        }
        
        @TestMetadata("classRecreated")
        public void testClassRecreated() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/classRecreated/");
        }
        
        @TestMetadata("classSignatureChanged")
        public void testClassSignatureChanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/classSignatureChanged/");
        }
        
        @TestMetadata("classSignatureUnchanged")
        public void testClassSignatureUnchanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/classSignatureUnchanged/");
        }
        
        @TestMetadata("constantsUnchanged")
        public void testConstantsUnchanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/constantsUnchanged/");
        }
        
        @TestMetadata("dependencyClassReferenced")
        public void testDependencyClassReferenced() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/dependencyClassReferenced/");
        }
        
        @TestMetadata("filesExchangePackages")
        public void testFilesExchangePackages() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/filesExchangePackages/");
        }
        
        @TestMetadata("independentClasses")
        public void testIndependentClasses() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/independentClasses/");
        }
        
        @TestMetadata("inlineFunctionsCircularDependency")
        public void testInlineFunctionsCircularDependency() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/inlineFunctionsCircularDependency/");
        }
        
        @TestMetadata("inlineFunctionsUnchanged")
        public void testInlineFunctionsUnchanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/inlineFunctionsUnchanged/");
        }
        
        @TestMetadata("multiplePackagesModified")
        public void testMultiplePackagesModified() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/multiplePackagesModified/");
        }
        
        @TestMetadata("objectValChanged")
        public void testObjectValChanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/objectValChanged/");
        }
        
        @TestMetadata("ourClassReferenced")
        public void testOurClassReferenced() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/ourClassReferenced/");
        }
        
        @TestMetadata("packageConstantChanged")
        public void testPackageConstantChanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageConstantChanged/");
        }
        
        @TestMetadata("packageFileAdded")
        public void testPackageFileAdded() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageFileAdded/");
        }
        
        @TestMetadata("packageFileChangedPackage")
        public void testPackageFileChangedPackage() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageFileChangedPackage/");
        }
        
        @TestMetadata("packageFileChangedThenOtherRemoved")
        public void testPackageFileChangedThenOtherRemoved() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageFileChangedThenOtherRemoved/");
        }
        
        @TestMetadata("packageFileRemoved")
        public void testPackageFileRemoved() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageFileRemoved/");
        }
        
        @TestMetadata("packageFilesChangedInTurn")
        public void testPackageFilesChangedInTurn() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageFilesChangedInTurn/");
        }
        
        @TestMetadata("packageInlineFunctionAccessingField")
        public void testPackageInlineFunctionAccessingField() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageInlineFunctionAccessingField/");
        }
        
        @TestMetadata("packageInlineFunctionChanged")
        public void testPackageInlineFunctionChanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageInlineFunctionChanged/");
        }
        
        @TestMetadata("packageInlineFunctionFromOurPackage")
        public void testPackageInlineFunctionFromOurPackage() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageInlineFunctionFromOurPackage/");
        }
        
        @TestMetadata("packageRecreated")
        public void testPackageRecreated() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageRecreated/");
        }
        
        @TestMetadata("packageRecreatedAfterRenaming")
        public void testPackageRecreatedAfterRenaming() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageRecreatedAfterRenaming/");
        }
        
        @TestMetadata("packageRemoved")
        public void testPackageRemoved() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/packageRemoved/");
        }
        
        @TestMetadata("returnTypeChanged")
        public void testReturnTypeChanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/returnTypeChanged/");
        }
        
        @TestMetadata("simpleClassDependency")
        public void testSimpleClassDependency() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/simpleClassDependency/");
        }
        
        @TestMetadata("soleFileChangesPackage")
        public void testSoleFileChangesPackage() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/soleFileChangesPackage/");
        }
        
        @TestMetadata("topLevelFunctionSameSignature")
        public void testTopLevelFunctionSameSignature() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/topLevelFunctionSameSignature/");
        }
        
        @TestMetadata("topLevelMembersInTwoFiles")
        public void testTopLevelMembersInTwoFiles() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/topLevelMembersInTwoFiles/");
        }
        
        @TestMetadata("traitClassObjectConstantChanged")
        public void testTraitClassObjectConstantChanged() throws Exception {
            doTest("jps-plugin/testData/incremental/pureKotlin/traitClassObjectConstantChanged/");
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("PureKotlin");
            suite.addTestSuite(PureKotlin.class);
            return suite;
        }
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("IncrementalJpsTestGenerated");
        suite.addTestSuite(IncrementalJpsTestGenerated.class);
        suite.addTest(PureKotlin.innerSuite());
        return suite;
    }
}
