
package com.grumpy.media.client;

import java.net.URI;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import com.grumpy.media.client.builder.TenantBuilder;
import com.hybris.ramler.commons.RequestParams;
import com.hybris.ramler.commons.builder.AbstractResourceBuilder;


/**
 * This the entrance point to the Media Repository client.
 * <p>
 * It is a wrapper for a JAX-RS REST client that will call the Media Repository.
 * <p>
 * Specifying the path which we want to call, as well as other request parameters, is done by using immutable builders:
 * modifying any property of the current request is creating a new instance of a builder. This assures that building the
 * client is thread safe.
 * <p>
 * Available builders for this API's resources:
 * <ul>
 * <li>{@link #tenant()}</li>
 * </ul>
 * 
 */
public class MediaRepositoryClient
    extends AbstractResourceBuilder<MediaRepositoryClient>
{

    /**
     * The default URL or the repository service, as defined in the RAML.
     * 
     */
    public final static String DEFAULT_BASE_URI = "https://api.yaas.io/hybris/media-repository/b1";
    private final String baseUri;
    private final Client client;

    /**
     * Creates an instance of the {@link MediaRepositoryClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public MediaRepositoryClient(final String baseUri) {
        this(baseUri, ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link MediaRepositoryClient} for the given URI.
     * 
     * @param baseUri the base URI of the service
     * 
     */
    public MediaRepositoryClient(final URI baseUri) {
        this(baseUri.toString(), ClientBuilder.newClient(), new RequestParams());
    }

    /**
     * Creates an instance of the {@link MediaRepositoryClient} for the given URI, based on the supplied JAX-RS client
     * instance.
     * <p>
     * Use this constructor to customize the JAX-RS client to use.
     * 
     * @param baseUri the base URI of the service
     * @param client an instance of JAX-RS client
     * 
     */
    public MediaRepositoryClient(final String baseUri, final Client client) {
        this(baseUri, client, new RequestParams());
    }

    private MediaRepositoryClient(final String baseUri, final Client client, final RequestParams params) {
        super(baseUri, client, params);
        this.baseUri = baseUri;
        this.client = client;
    }

    @Override
    protected MediaRepositoryClient makeACopy(final RequestParams params) {
        return new MediaRepositoryClient(baseUri, client, params);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}</code>.
     * 
     * @return an instance of {@link TenantBuilder}
     * 
     */
    public TenantBuilder tenant() {
        return new TenantBuilder(getTarget(), getRequestParams(), true);
    }

    /**
     * Returns a new {@link com.hybris.ramler.commons.builder.ResourceBuilder} for the sub-resource located at the relative URI: <code>/{tenant}</code>,
     * with the URI parameters filled with the provided values.
     * <p>
     * If you do not want to specify the values for the URI parameters yet, use the {@link #tenant()} method instead.
     * 
     * @return an instance of {@link TenantBuilder}
     * @param tenant the value of the <code>tenant</code> URI parameter
     * 
     */
    public TenantBuilder tenant(String tenant) {
        TenantBuilder resourceBuilder = new TenantBuilder(getTarget(), getRequestParams(), true);
        resourceBuilder = resourceBuilder.fillTenant(tenant);
        return resourceBuilder;
    }

}
