/*
 * Copyright 2010-2013 JetBrains s.r.o.
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

package org.jetbrains.jet.codegen.intrinsics;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jet.codegen.CallableMethod;
import org.jetbrains.jet.codegen.ExpressionCodegen;
import org.jetbrains.jet.codegen.StackValue;
import org.jetbrains.jet.lang.psi.JetCallExpression;
import org.jetbrains.jet.lang.psi.JetExpression;
import org.jetbrains.jet.lang.resolve.calls.model.ResolvedCall;
import org.jetbrains.jet.lang.resolve.java.jvmSignature.JvmMethodParameterKind;
import org.jetbrains.jet.lang.resolve.java.jvmSignature.JvmMethodParameterSignature;
import org.jetbrains.jet.lang.resolve.java.jvmSignature.JvmMethodSignature;
import org.jetbrains.org.objectweb.asm.Opcodes;
import org.jetbrains.org.objectweb.asm.Type;
import org.jetbrains.org.objectweb.asm.commons.InstructionAdapter;
import org.jetbrains.org.objectweb.asm.commons.Method;

import java.util.Arrays;
import java.util.List;

import static org.jetbrains.jet.lang.resolve.java.AsmTypeConstants.FUNCTION0_TYPE;
import static org.jetbrains.jet.lang.resolve.java.AsmTypeConstants.OBJECT_TYPE;

public class StupidSync extends IntrinsicMethod {
    @NotNull
    @Override
    public Type generateImpl(
            @NotNull ExpressionCodegen codegen,
            @NotNull InstructionAdapter v,
            @NotNull Type returnType,
            @Nullable PsiElement element,
            @Nullable List<JetExpression> arguments,
            @Nullable StackValue receiver
    ) {
        assert element != null : "Element should not be null";

        CallableMethod callableMethod = new CallableMethod(
                Type.getObjectType("kotlin/jvm/internal/Intrinsics"),
                null,
                null,
                new JvmMethodSignature(new Method("stupidSync", Type.getMethodDescriptor(OBJECT_TYPE, OBJECT_TYPE, FUNCTION0_TYPE)), null,
                                       Arrays.asList(new JvmMethodParameterSignature(OBJECT_TYPE, JvmMethodParameterKind.VALUE),
                                                     new JvmMethodParameterSignature(FUNCTION0_TYPE, JvmMethodParameterKind.VALUE))),
                Opcodes.INVOKESTATIC,
                null,
                null,
                null
        );

        ResolvedCall<?> resolvedCall = codegen.resolvedCall(((JetCallExpression) element).getCalleeExpression());

        codegen.invokeMethodWithArguments(null, callableMethod, resolvedCall, StackValue.none());

        return OBJECT_TYPE;
    }
}
