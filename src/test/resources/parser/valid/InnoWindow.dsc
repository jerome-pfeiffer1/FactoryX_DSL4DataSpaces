connector config InnoWindow {

  discovery {
    linkedAssetID assembly-ur10;
    baseUrl "https://dataspace.innowindow.isw.uni-stuttgart.de";
    endpoint "opc.tcp://ur10.assembly:4840";
    idType URI;
    asset {
      title UR10 OPC UA Machine Server;
      description "Access to machine data via OPC UA";
      publisher coPack GmbH;
      sidiCodes ["machinery","opcua","production"];
      version "1.2.0";
      created "2025-05-10T10:00:00Z";
      modified "2025-08-01T12:00:00Z";
      language en;
    }
  }

  edc usage {
    dataAddress "opc.tcp://ur10.assembly:4840/opcua";
    dataSchemaAddress "https://isw.uni-Stuttgart.de/machinery-nodeset";
    remoteAddress "https://edc.isw.uni-stuttgart.de/api";
    remoteID urn:copack:ur10;
    xAPIKey "edc-api-copack";
    stsServiceAddress "https://sts.copack.eu";
    registries {"edc.isw.uni-stuttgart.de/registry"};
    push endpoints{
      cloudPush { telemetry = "https://manu0711.cloud/telemetry" };
      callBackAddress "https://edc.isw.uni-stuttgart.de/edc/callback";
    }
    access policy {
      usagePolicy "IDS: Monitoring only, no redistribution";
      contractOffer { validUntil="2026-01-01", allowedOps="read" };
      accessControl [
        Role { name operator; permissions [read, subscribe]; },
        Role { name partner;  permissions [read]; }
      ];
      identity provider config {
        idpEndpoint "https://idp.isw.uni-Stuttgart.de/oauth2/token";
        clientId copack-idp-client;
        secret "copack-idp-secret";
        grantType client_credentials;
      }
    }
  }
}