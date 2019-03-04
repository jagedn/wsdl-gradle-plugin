/*
 * Copyright 2017 Intershop Communications AG.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
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
@file:Suppress("UnstableApiUsage")

package com.intershop.gradle.wsdl.utils

import kotlin.reflect.KProperty

/**
 * Property interface.
 */
@Suppress("UnstableApiUsage")
interface Property<T> : org.gradle.api.provider.Property<T>{

    /**
     * A property has a get value method.
     */
    operator fun getValue(thisRef: Any?, property: KProperty<*>): T = get()

    /**
     * A property has a set value method.
     */
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) = set(value)
}