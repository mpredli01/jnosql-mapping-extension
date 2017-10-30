/*
 *  Copyright (c) 2017 Otávio Santana and others
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   and Apache License v2.0 which accompanies this distribution.
 *   The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *   and the Apache License v2.0 is available at http://www.opensource.org/licenses/apache2.0.php.
 *
 *   You may elect to redistribute this code under either of these licenses.
 *
 *   Contributors:
 *
 *   Otavio Santana
 */
package org.jnosql.artemis.couchbase.document;

import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(CDIJUnitRunner.class)
public class CouchbaseExtensionTest {

    @Inject
    private PersonRepositoryAsync personRepositoryAsync;

    @Inject
    private PersonRepository personRepository;

    @Test
    public void shouldSaveOrientDB() {
        Person person = new Person("Ada", 10);
        personRepository.deleteById(person.getName());
        personRepositoryAsync.deleteById(person.getName());
    }
}