/*
 *  Copyright (c) 2022 Contributors to the Eclipse Foundation
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
 *   Alessandro Moscatelli
 */
package org.eclipse.jnosql.mapping.metamodel;

import org.eclipse.jnosql.mapping.metamodel.api.SingularAttribute;

/**
 * Default metamodel singular attribute implementation
 * @param <X> The Entity type the attribute belongs to
 * @param <T> The singular attribute type
 */
public abstract class DefaultSingularAttribute<X, T> extends DefaultAttribute<X, T> implements SingularAttribute<X, T> {

    public DefaultSingularAttribute(Class<X> type, Class<T> attributeType, String name) {
        super(type, attributeType, name);
    }

}


