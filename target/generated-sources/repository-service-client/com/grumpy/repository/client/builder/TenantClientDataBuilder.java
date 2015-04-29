
package com.grumpy.repository.client.builder;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractActionBuilder;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;
import com.hybris.ramler.commons.builder.ActionWithPayloadBuilder;
import com.hybris.ramler.commons.builder.HttpActionSettable;


/**
 * A {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the <code>/{client}/data</code> resource.
 * 
 * Available builders for this resource's sub-resources:
 * <ul>
 * <li>{@link #type()}</li>
 * </ul>
 * 
 */
public class TenantClientDataBuilder
    extends AbstractResourceBuilder<TenantClientDataBuilder>
{

    /**
     * The relative URI of this resource.
     * 
     */
    protected final static String RELATIVE_URI = "/{client}/data";
    /**
     * The static field for the <code>client</code> URI parameter name.
     * 
     */
    protected final static String URI_PARAM_CLIENT = "client";
    /**
     * The static field for storing all the URI parameter names of this resource.
     * 
     */
    protected final static String[] URI_PARAMS_ALL = new String[] {URI_PARAM_CLIENT };

    /**
     * Creates a new instance of the {@link TenantClientDataBuilder}, using the given {@link WebTarget} and {@link RequestParams}.
     * <p>
     * This constructor is not intended for general use. To obtain an instance of {@link TenantClientDataBuilder} use a
     * builder method of the appropriate {@link com.hybris.ramler.commons.builder.ResourceBuilder} instead.
     * 
     * @param webTarget custom WebTarget instance
     * @param requestParams custom RequestParams instance
     * @param appendRelativeUri whether the relative URI of this resource should be appended to the given WebTarget
     * 
     */
    public TenantClientDataBuilder(WebTarget webTarget, RequestParams requestParams, boolean appendRelativeUri) {
        super(webTarget, requestParams, (appendRelativeUri?RELATIVE_URI:null));
    }

    @Override
    protected TenantClientDataBuilder makeACopy(RequestParams newRequestParams) {
        return new TenantClientDataBuilder(getTarget(), newRequestParams, false);
    }

    /**
     * Fill the <code>client</code> URI parameter of this resource.
     * 
     * @param client the new value for the <code>client</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataBuilder fillClient(final String client) {
        return this.withUriParam(TenantClientDataBuilder.URI_PARAM_CLIENT, client);
    }

    /**
     * Fill the <code>tenant</code> URI parameter of this resource.
     * 
     * @param tenant the new value for the <code>tenant</code> URI parameter
     * @return a new instance of the builder
     * 
     */
    public TenantClientDataBuilder fillTenant(final String tenant) {
        return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{type}</code>.
     * 
     * @return an instance of {@link TenantClientDataTypeBuilder}
     * 
     */
    public TenantClientDataTypeBuilder type() {
        return new TenantClientDataTypeBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{type}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #type()} method instead.
     * 
     * @return an instance of {@link TenantClientDataTypeBuilder}
     * @param type the value of the <code>type</code> URI parameter
     * 
     */
    public TenantClientDataTypeBuilder type(String type) {
        TenantClientDataTypeBuilder resourceBuilder = new TenantClientDataTypeBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillType(type);
        return resourceBuilder;
    }

    /**
     * Returns an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any action for this resource.
     * 
     * @return an instance of {@link AnyActionBuilder}
     * 
     */
    public TenantClientDataBuilder.AnyActionBuilder prepareAny() {
        return new TenantClientDataBuilder.AnyActionBuilder(getTarget(), getRequestParams());
    }


    /**
     * An implementation of the {@link AnyActionBuilder} for creating an {@link com.hybris.ramler.commons.builder.ActionBuilder} for any HTTP action.
     * 
     */
    public static class AnyActionBuilder
        extends TenantClientDataBuilder.ArbitraryActionBuilder<TenantClientDataBuilder.AnyActionBuilder>
        implements ActionWithPayloadBuilder<TenantClientDataBuilder.AnyActionBuilder, Object> , HttpActionSettable<TenantClientDataBuilder.AnyActionBuilder>
    {


        /**
         * Creates a new instance of a {@link AnyActionBuilder}, for a given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget
         * @param requestParams the given RequestParams
         * 
         */
        public AnyActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        @Override
        protected TenantClientDataBuilder.AnyActionBuilder makeACopy(RequestParams newRequestParams) {
            final TenantClientDataBuilder.AnyActionBuilder actionBuilder = new TenantClientDataBuilder.AnyActionBuilder(getTarget(), newRequestParams);
            actionBuilder.setHttpMethod(this.getHttpMethod());
            actionBuilder.setRequestPayload(this.getRequestPayload());
            return actionBuilder;
        }

        @Override
        public TenantClientDataBuilder.AnyActionBuilder withPayload(Entity<?> payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataBuilder.AnyActionBuilder withPayload(Object payload) {
            return this.withRequestPayload(payload);
        }

        @Override
        public TenantClientDataBuilder.AnyActionBuilder withPayload(Object payload, String mediaType) {
            return this.withRequestPayload(payload, mediaType);
        }

        @Override
        public TenantClientDataBuilder.AnyActionBuilder fillMethod(com.hybris.ramler.commons.builder.ActionBuilder.HttpMethod theMethod) {
            final TenantClientDataBuilder.AnyActionBuilder actionBuilder = makeACopy(this.getRequestParams().makeACopy());
            actionBuilder.setHttpMethod(theMethod);
            return actionBuilder;
        }

    }


    /**
     * Base abstract class for all {@link com.hybris.ramler.commons.builder.ActionBuilder}s for this resource.
     * 
     * @param <T> the type of the builder which will be produced by the builder methods
     * 
     */
    public static abstract class ArbitraryActionBuilder<T extends TenantClientDataBuilder.ArbitraryActionBuilder<?> >
        extends AbstractActionBuilder<T>
    {


        /**
         * Creates a new instance of the {@link ArbitraryActionBuilder}, for given {@link WebTarget} and
         * {@link RequestParams}.
         * 
         * @param webTarget the given WebTarget instance
         * @param requestParams the given RequestParams instance
         * 
         */
        public ArbitraryActionBuilder(WebTarget webTarget, RequestParams requestParams) {
            super(webTarget, requestParams);
        }

        /**
         * Fill the <code>client</code> URI parameter of this resource.
         * 
         * @param client the new value for the <code>client</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillClient(final String client) {
            return this.withUriParam(TenantClientDataBuilder.URI_PARAM_CLIENT, client);
        }

        /**
         * Fill the <code>tenant</code> URI parameter of this resource.
         * 
         * @param tenant the new value for the <code>tenant</code> URI parameter
         * @return a new instance of the builder
         * 
         */
        public T fillTenant(final String tenant) {
            return this.withUriParam(TenantBuilder.URI_PARAM_TENANT, tenant);
        }

    }

}
