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

package org.jetbrains.jet.codegen;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.resolve.calls.model.DefaultValueArgument;
import org.jetbrains.jet.lang.resolve.calls.model.ExpressionValueArgument;
import org.jetbrains.jet.lang.resolve.calls.model.ResolvedValueArgument;
import org.jetbrains.jet.lang.resolve.calls.model.VarargValueArgument;

public abstract class ArgumentGenerator {
    public abstract void generateExpression(int i, @NotNull ExpressionValueArgument argument);

    public abstract void generateDefault(int i, @NotNull DefaultValueArgument argument);

    public abstract void generateVararg(int i, @NotNull VarargValueArgument argument);

    @SuppressWarnings("MethodMayBeStatic")
    public void generateOther(int i, @NotNull ResolvedValueArgument argument) {
        throw new UnsupportedOperationException("Unsupported value argument (" + i + "): " + argument);
    }
}
