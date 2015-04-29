
package com.grumpy.product.client;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import com.grumpy.product.client.builder.TenantProductsBuilder;
import com.grumpy.product.client.builder.TenantProducttypesBuilder;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;


/**
 * This the entrance point to the hybris Products API client.
 * <p>
 * It is a wrapper for a JAX-RS REST client that will call the hybris Products API.
 * <p>
 * Specifying the path which we want to call, as well as other request parameters, is done by using immutable builders:
 * modifying any property of the current request is creating a new instance of a builder. This assures that building the
 * client is thread safe.
 * <p>
 * Available builders for this API's resources:
 * <ul>
 * <li>{@link #tenantProducts()}</li>
 * <li>{@link #tenantProducttypes()}</li>
 * </ul>
 * 
 */
public class HybrisProductsApiClient
    extends AbstractResourceBuilder<HybrisProductsApiClient>
{

    /**
     * The default URL or the repository service, as defined in the RAML.
     * 
     */
    public final static String DEFAULT_BASE_URI = "https://api.yaas.io/product/v3";
    private final String baseUri;
    private final Client client;

    /**
     * Creates an instance of the {@link HybrisProductsApiClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public HybrisProductsApiClient(final String baseUri) {
        this(baseUri, ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link HybrisProductsApiClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public HybrisProductsApiClient(final URI baseUri) {
        this(baseUri.toString(), ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link HybrisProductsApiClient} for the given URI, based on the supplied JAX-RS client
     * instance.
     * <p>
     * Use this constructor to customize the JAX-RS client to use.
     * 
     * @param baseUri the base URI of the service
     * @param client an instance of JAX-RS client
     * 
     */
    public HybrisProductsApiClient(final String baseUri, final Client client) {
        this(baseUri, client, new RequestParams());
    }

    private HybrisProductsApiClient(final String baseUri, final Client client, final RequestParams params) {
        super(baseUri, client, params);
        this.baseUri = baseUri;
        this.client = client;
    }

    @Override
    protected HybrisProductsApiClient makeACopy(final RequestParams params) {
        return new HybrisProductsApiClient(baseUri, client, params);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/products</code>.
     * 
     * @return an instance of {@link TenantProductsBuilder}
     * 
     */
    public TenantProductsBuilder tenantProducts() {
        return new TenantProductsBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/products</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantProducts()} method instead.
     * 
     * @return an instance of {@link TenantProductsBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantProductsBuilder tenantProducts(String tenant) {
        TenantProductsBuilder resourceBuilder = new TenantProductsBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/producttypes</code>.
     * 
     * @return an instance of {@link TenantProducttypesBuilder}
     * 
     */
    public TenantProducttypesBuilder tenantProducttypes() {
        return new TenantProducttypesBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}/producttypes</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenantProducttypes()} method instead.
     * 
     * @return an instance of {@link TenantProducttypesBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantProducttypesBuilder tenantProducttypes(String tenant) {
        TenantProducttypesBuilder resourceBuilder = new TenantProducttypesBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

}
