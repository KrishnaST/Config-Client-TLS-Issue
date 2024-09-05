public class XMLSignatureTest {
	
	//private static final Logger logger = LoggerFactory.getLogger(SignatureFilter.class);
	/*
	public void test() throws SAXException, IOException, ParserConfigurationException {
		ApplicationContext context = null;
		String krish = "<ns2:RespHbt xmlns:ns2=\"http://npci.org/upi/schema/\" xmlns:ns3=\"http://npci.org/cm/schema/\"><Head msgId=\"NPCIdf4e0a0235641f7a569f307f0dd9a15\" orgId=\"NPCI\" prodType=\"IMPS\" ts=\"2022-03-08T15:37:59.046+05:30\" ver=\"2.0\"/><Resp reqMsgId=\"DTY632a07c0692d4f20b7dddf2ed14a2614\" result=\"SUCCESS\"/><Txn id=\"DTY7346f82f55ff4bf4863a39b1f25a61ac\" note=\"Heart beat\" refId=\"DTYa191033fc668434494372898ef5412a9\" refUrl=\"http://npci.org/upi/schema/\" ts=\"2022-03-08T15:37:59.046+05:30\" type=\"Hbt\"/><Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\"><SignedInfo><CanonicalizationMethod Algorithm=\"http://www.w3.org/TR/2001/REC-xml-c14n-20010315\"/><SignatureMethod Algorithm=\"http://www.w3.org/2001/04/xmldsig-more#rsa-sha256\"/><Reference URI=\"\"><Transforms><Transform Algorithm=\"http://www.w3.org/2000/09/xmldsig#enveloped-signature\"/></Transforms><DigestMethod Algorithm=\"http://www.w3.org/2001/04/xmlenc#sha256\"/><DigestValue>jAHCmIzLr094O+xN8ZF5Q9gYJJ1S+r3dpWLu5SGWvuw=</DigestValue></Reference></SignedInfo><SignatureValue>cgvBA5N/6uoGRPtQiEmJcpePqSr5jwkDX4E/bDgFiU8Jlnq7S0EOiRmjhfTPVAljniupBT/NhrfY&#13;\r\n"
				+ "0MD2EHf9JchPhfhCNGW8Nv6t9JdKYFK/Hi8FO5wQPRZ1xWPhMXjeB7zeOuVub9f5htlWbC1wYklv&#13;\r\n"
				+ "7p71/ock+9mkmeQK2LU4VaLzcn2YJBqKUgu7xt+NPCX2EVxV89le0RAuCV5S84WOWo858TM9WJK2&#13;\r\n"
				+ "zzb1NN7Y50Zl3JEkNxzYtTIrzY7jF312Ea+b+474gZPjV+q5/65J/Fj1Ux/98pJ7QcXyBiTMSS6W&#13;\r\n"
				+ "pdFHrlHe+jxCM9vrSqVAIZZU6uTW0NSrKHNolQ==</SignatureValue><KeyInfo><KeyValue><RSAKeyValue><Modulus>uMKxWfy0WcPp98muBWa6yhpmb6ZGZGSKHRIOv05UlIN5TbUPl6yEerh7Wj0+JyKfsOntRdAVhkLJ&#13;\r\n"
				+ "GRoHwH6gEEeFNHge7kPea/B33cQAbqa39mnP5F1aaZT3tjJnKrfI1Wum0crdb7dAMzft4JILOEa+&#13;\r\n"
				+ "s3Uh7OdYEl/Xp7EisdSoJ345Cj0LTfLZEQzRdVGovXZrfLByJysH11V9tDrIVv75C/3UndwjHt3N&#13;\r\n"
				+ "rqzNBoUMh5VZRFkcwuebUAkhIed5gvoysJwd0yYGrAUXNrXJJDTAj5diCuasWyfWZR9lsX5l14hd&#13;\r\n"
				+ "xF+lqadR/pgII53DW5oEy2LMXgvt2u/qmSml8w==</Modulus><Exponent>AQAB</Exponent></RSAKeyValue></KeyValue></KeyInfo></Signature></ns2:RespHbt>";
		
		final Document requestDocument = XMLUtils.bytesToDocument(krish.getBytes());
		final boolean isValidSignature = XMLUtils.validateXMLDigitalSignature(context.getBean("npciSignerPublicKey", PublicKey.class), requestDocument);
		final NodeList signatureNodes = requestDocument.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature");
		logger.info("signatureNodes count : "+signatureNodes.getLength());
		//logger.info("signatureNodes count : "+requestDocument.getElementsByTagNameNS(XMLSignature.XMLNS, "Signature").getLength());
		if(signatureNodes.getLength() > 0) {
			signatureNodes.item(0).getParentNode().removeChild(signatureNodes.item(0));
		}
		logger.info("isValidSignature : " + isValidSignature);
		logger.info("request from npci : \r\n"+XMLUtils.documentToString(requestDocument));
	
	}
	
	*/
}

