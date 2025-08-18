DataSpaceConnectorConfiguration InnoWindow {

  IdentificationData {
    linkedAssetID = "factory-001-line-A";
    baseUrl = "https://dataspace.federated-factory.com";
    endpoint = "opc.tcp://machine-001.factory:4840";
    idType = "URI";
  }

  AssetMetaData {
    title = "OPC UA Machine Server – Production Line A";
    description = "Access to machine data via OPC UA, including temperature, states, and KPIs";
    publisher = "Federated Factory GmbH";
    sidiCode = ["machinery","opcua","production"];
    version = "v1.2";
    created = "2025-05-10T10:00:00Z";
    modified = "2025-08-01T12:00:00Z";
    language = "en";
  }

  OPCUAUsage {
    supportedProtocols = ["opc.tcp"];
    qosMetrics = ["sampling=1s","maxSubscriptions=100"];
    securityPolicy = "Basic256Sha256";
    securityMode = "SignAndEncrypt";
    authenticationMode = "UsernamePassword";
  }

  EDCUsage {
    remoteAddress = "https://edc.factory.com/api";
    remoteID = "urn:edc:federated-factory:machine-001";
    xAPIKey = "edc-test-key-123";
    stsServiceAddress = "https://sts.factory.com";
    trustedDIDRegistries = ["did:example:trusted1","did:example:trusted2"];

    EDCPushEndpointsConfig {
      cloudPush = { "telemetry"="https://partner.cloud/telemetry" };
      callBackAddress = "https://factory.com/edc/callback";
    }
  }

  AccessPolicy {
    usagePolicy = "IDS: Monitoring only, no redistribution";
    contractOffer = { "validUntil"="2026-01-01","allowedOps"="read" };
    accessControl = [
      Role { roleName = "operator"; permissions = ["read","subscribe"]; },
      Role { roleName = "partner"; permissions = ["read"]; }
    ];
  }

  IdentityProviderConfig {
    idpEndpoint = "https://idp.factory.com/oauth2/token";
    clientId = "factory-client-123";
    secret = "superSecretValue";
    grantType = "client_credentials";
  }

  OAuthInfo {
    id = "oauth-factory";
    secret = "anotherSecret";
    grantType = "client_credentials";
    scope = "machine.read telemetry.read";
  }
}
