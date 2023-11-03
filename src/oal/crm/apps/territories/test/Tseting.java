package oal.crm.apps.territories.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tseting {

	
	 public static void program(int ItemNumber , int quantity) {
		 
		 int[] itemNumArr = new int[4];
		 int[] itemNameArr = new int[4];
		 int[] priceArr = new int[4];
		 int[] stockArr = new int[4];
		
		
		 
	 }
	 
	 
	 static void getItemIndex(int[] item, int itemNumber) {
//		 for(int i =0; i < itemNumber.length ;i++) {
//			 
//			 
//		 }
	 }
	 
		static int removeOccurences(int[] arr, int k) {
			// add your logic here
			int ptr =0;
			for (int i =0 ; i< arr.length ;i++) {
				if(arr[i] == k) {
					int j= i+1;
					while(j<arr.length && arr[j] != k  ) {
						j++;
					}
					arr[i] =arr[j-1];
					ptr++;
					
				}
			}
			print(arr);
			return arr.length-ptr;
		}
		
		public static void main(String[] args) {
			//int[] arr = {1,2,3,4,4,4,2,2,1,4};
			
			//int op= removeOccurences(arr,4);
			//System.out.println(op);
//			Set s = new HashSet();
//			//s.add("helo");
//			System.out.println(mapRequestDtlToTeamDtl(s));
// List<Long> list = new ArrayList();
// list.add(101L);
// list.add(101L);
// list.add(101L);
// list.add(101L);
// System.out.println(list.toString().replaceAll(null, null)
		
//			System.out.println(pangram("the quick brown fox jumps over the lazy dog"));
			cookie();
			
//			Set<String> emails = new HashSet<String>();
//			String ccEmails = String.join(",", emails);
//			System.out.println(ccEmails);
		}
		static void print(int[] arr) {
			
			for (int n :arr) {
				System.out.print(n +" ");
			}
			System.out.println();
		}
		
		
		private static List<String> mapRequestDtlToTeamDtl(Set<String> dtls) {
	        List<String> teams = new ArrayList<>();
	        System.out.println(dtls);
	        System.out.println(dtls.size());
	        System.out.println(dtls.parallelStream().count());
	        
	        try {
	        dtls.parallelStream()
	                .forEach(e -> {
	                    System.out.println("hello"+e);
	                    teams.add(e);
	                });
	        }catch (Exception e) {
				System.out.println(e);
			}
	        return teams;
	    }
		
		static String pangram(String str) {
			StringBuilder sb = new StringBuilder();
			
			
			int[] arr= new int[26];
			for (char c : str.toCharArray()) {
				if (c ==' ') continue;
				arr[c-'a'] = arr[c-'a']+1;
			}
			System.out.println(arr.toString());
			for (int i =0 ;i < arr.length ; i++) {
				System.out.print(arr[i]+" ");
				if(arr[i] == 0)
					sb.append( (char) ('a'+i));
			}
//			System.out.println((char)('a'+10));
			return sb.toString();
		}
		
		
		
		static void cookie() {
 String s = "ORA_OCIS_CG_SESSION_idcs-ae5270dfd3df46d9b4ba8427662a3e32_gxpdt.oracle.com=JAoAAOoJAAAQIOoJAADQCQAAEACYGlLarQ_zqEHkmezcTUTTxJ4nEe4pd1uqAG5AFMAGA4al2x19fTgkYPyIo4Fm26I39ORRD7_Xeo2Eg2wHLanbWWfSxq4occSESurmzu3GMD35hj7ryCSrYYMrrrEGNJSfac6JDukaFpMRU58qj0kTD3a6jnkbeV828_g4JViqoXGI4bTpCn9h2KR6APMpm_LWSE4DoNIG5u5T7B56HcTbIVqDAMhDDksczSqvC0qpSL_lyJ9ZbZYveghX74Vyd9b3TrWt3JrLOpAsZZg6o4lsYVvRtQwe8fqg5c5KZS463CN82QPCDoxUaLGwcL6qBKRMHhnLRfgUmf5aPnuPsGjCP9UmFJJnZ5WBsCNJXgoCiBAL8RUJVVblZ_HO-fD_miqqNlQJLuXoocJGfbrGJKnQ7s33byQQxwADcimHEXyKI2JaKgdTTf-hlOrIzQZEVh51AAZQ8r4OfR_wM4FRCuXDchZBwzu3a4fRf9q5txeG_STOdt_vpKh9aJMgr2oRQzjGUNd-iJjYCUpZZYVR4BlAJsGMBV6KEff6vBpEbJ4zjFOi8AfSCczIEXT8WbLLg9xuyr1-HqWORRx3fM6jumyiC4tOpGDMJ1HDZ6_sytc3xdZ7uK96SunMykXekcfn4JAsoo7tYfDR5DnnIWlExNTFXJpCZg_iOAByGZkv6Er3yAcjWWG6iF0lG_pR3Pb8Y4OhaLGAE-WMenNMCGOz0FBlXOsIa_jtCelnEbsd9_jRks77odZ6_8HP29CRQqxbxtdJapWPIOysl3V5CeZASKpPD2fXjw6EjtZoHWOpd62qfCkibOUVDDE3nmZ5xCWx8GNVMnRA7rD-opB22q6H-VoZz7svT1_vnN44fzw2LZYt_-wqPiAOn4VTnSxRUqUEwa6D12yd6HrQS01HTH6Xllq5kzdutZQBj2ujO4VR0PflaBmA6PkskQCBEk0WQz9gt1143sSzUXzxAicgYSloyjvzQjeZlYvD7jd6q1nBcWR5BA4a3ua3cmEJtL1YFywWgmfsPwqX6ps2PmRx-EGbhT1Si6TuEstEceVdnXEGyD0vdFEFH9bjUyTuq1UG5r-i34teGp6fOE6q9JjLIyiowFZC9PBG5Jd4TS3VNzfxWcGGMmlJhGZFdRY58jIB_NsFIrTZ6d4I1TssUhb7G4VITDLZ2wVwRJsRNgnWU8UaOpkSxF2Y59lu_5ePcm4zQ0VUjVm8FJPKT_bb-k8bsaMlVYLYLUjo0qnzbjJFckVlo0sTphYvnG3doMtm9q3pXtFOPNmRy7T-GzlkcMz1GfcTUkDXMiNUogUHLHuvTCtfYalZtKCkgP_hZqDN93nms_MraOHWTE5dug4MYm7acKJX6MzMmqgX44XkiTLkRcQ3bn2DR2VVWFuVkfrcoUUnw5kB6wHmgACv7eqyoxkMbJ4WDpNFzItpdR8g4QzuPQcpic2qK2g3712uNvmmqEWyUa97OTYfG6q2iV0IBvCPIB7iAN_Yn4bkVX62boeuNYfxiQcO_KE6pBIeK-oCjSmyOY0aJbvUrY22OD37jh1PlHPVk5JnmBNXW2U3kVswweB_ULuQMJlRlBDJKpfVHPAJzILQf-kSWubuoAly1nZXkNulTCafIlMq4wTK8tjoEeT5MMUoPhe1EgZo5HGtCSOOBiDrNkBoDhk7pjLbQRlpYLrXlv93pW8BC_M_GAG3J52nG8O20qd7c4jA8gex4llOUq6h2Kt4UFlFIPQAzhzkX_2ygnwcCqO2CJUewaENBIrubJJdpH0mlQLhYwPwCxF6QbKXdV_C7shfZKqRLBlEu7e1g9s9vuoYEUKoYh3EE0v168ek-2vBDzabD9b95Ak7ZkAV8MM7uLtxZBh4uWBWxLi3b0mXa0_ZMYfZJ-U05fFkRuGSjS2xtO5bjjoQEAVtYKoGAwhkkWIn6_oEEhFhxgPtxjeInDEu1wwZDZt5TvI_Ltj8HF-92SFbWCyYH07kn0ufXkyEgRyK8Mj0F0mYZ9F37dLSISTBnA-MS8I5UhSPIMS6AP7QLKOD7Hf3QPbJJ8ts6aD-DVcbJX879G3eIxGcPw7RvMQdOKZGeI8V1DOA-HvgrDPrpvT478UgtB5f4CpfO3FMVOvPq9SeEBent95wflH3OdVHp6ZOQ55iDtzFqpcKD6JK-9jLFuBbM9nARGuKOlLyXvkkH-PBG0mRAS_CNJtoFjHPpv3N9EjMTX0PrVTM_PW9OLsYDLEEbJrgBWuECh3rdzGC4_zeea-3Gq-2WFh_ES8-u5PgdbnksWgFWW0ijYy_rDqsK9piLYsp811XT5wbylKC62fc0fLpn0UCsV7nm5Uz2bX9qjD_BYOWJ4PAmYFlGBazS-oJnIUxTAxSsFjqCe6upnnPyXm4uzb3wPiNRdtOJL7CPPYSLJ3J_CW9wMT8WQzlceEjl4yrAUQt0ad76uuFYYM6mkI11FrZK-gQjADniW5ggVHYMvPbXx7rIkqiy65Cci6BNsETKU1gf8O5nvExQ8e8VSvnT4V0lGHuKIMgItcG0tSgFxUXoNytQPfjp8kcU_zzuHwh5bDe7T6-K3reZkG26V3m9lDq2xGDm7A6ujrb2vU1dGfqyOKb5vLYOC1VOQ9QBAhOcEWz6ci6fHM-FxcOUdxu7c6jwGAenCo6FoWyWckvHiaEVBZg2V5XRV_ePvo4kl6MdKr7e5J9mdWl00NN6v8Gy9uQK4hoowqvfWR1a_R9GGv4QS3Q6RDjOxVBO3ePYzB8v8sfYYHNtPMSKQJOfEhFQS4bcY_ReUtNd7zSQ_2Lbm75d_Rg-NfeUR4DkXZhKwMVRRGJ3Q42hMfVbo8A-Xt4MlnlkqSj3GNBQ6WDN_mHEIsiaUw-JDYApFVHf-uyyNI3yNIWN0q0d-3Y66ovzLm1KODe7aYpoc8E0RL8uUG2h8lMLwGcuUPdEVxQM7wz0nl5ucgI4Q8KMZzjLJtfvjcMgBY0HKwH7E4sqRei9Vd6AHss04_d_-tAWNfdZYKGnqj_RFe5sGyDUof3abVk-mfKWEq6WKL3PzjXR6UfGIhDRDN4e1CqEHDisXdgAPfDTLNWCgNKAVYqhagXqwrU1KZV1wSlNGCOGgJbmVu-rsq0t0EFngFx9BcD_OtqTRihe1xynZkNj_TKqv9Q2cuS5qgCoI2uQd7Jjm0Ig2WSmUUyRrUWfW1JeTeV3xRxZTc9zQuW2eEM-aVAyLyezYMgV2EDgaYoIU83zvd9jwFcHeUfSp9bFPdOw4K4TjA2S8F0aiRNUge994znvVzeohH6xK4UNGjTXxCtmIbm6-6YFloi7V185zIKk7ykaXG4sLMC17PhTpCC6DCdyRGHgftWKu7oDg0NuVcNppzZPpaQsNhJgU9v3CkS68M1fPOhtj-iwimV4_DkYyXT3w4yGZwLJKCAvEYxV8oLr22jOG2jj-LHFpdv2J3IJA; path=/; HttpOnly; SameSite=None; secure; domain=gxpdt.oracle.com" ;
			 
			 System.out.println(s.length());
			 int i= 0;
			for (char c : s.toCharArray()) {
				
				if(i++ % 500 == 0) {
					System.out.println();
				}
				 System.out.print(c);
			}
			
			String s2= "ORA_OCIS_CG_SESSION_idcs-ae5270dfd3df46d9b4ba8427662a3e32_gxpdt.oracle.com=JAoAAOoJAAAQIOoJAADQCQAAEACYGlLarQ_zqEHkmezcTUTTxJ4nEe4pd1uqAG5AFMAGA4al2x19fTgkYPyIo4Fm26I39ORRD7_Xeo2Eg2wHLanbWWfSxq4occSESurmzu3GMD35hj7ryCSrYYMrrrEGNJSfac6JDukaFpMRU58qj0kTD3a6jnkbeV828_g4JViqoXGI4bTpCn9h2KR6APMpm_LWSE4DoNIG5u5T7B56HcTbIVqDAMhDDksczSqvC0qpSL_lyJ9ZbZYveghX74Vyd9b3TrWt3JrLOpAsZZg6o4lsYVvRtQwe8fqg5c5KZS463CN82QPCDoxUaLGwcL6qBKRMHhnLRfgUmf5aPnuPsGjCP9UmFJJnZ5WBsCNJXgoCiBAL8RUJVVblZ_HO-fD_miqqNlQJLuXoocJGf\n"
					+ "brGJKnQ7s33byQQxwADcimHEXyKI2JaKgdTTf-hlOrIzQZEVh51AAZQ8r4OfR_wM4FRCuXDchZBwzu3a4fRf9q5txeG_STOdt_vpKh9aJMgr2oRQzjGUNd-iJjYCUpZZYVR4BlAJsGMBV6KEff6vBpEbJ4zjFOi8AfSCczIEXT8WbLLg9xuyr1-HqWORRx3fM6jumyiC4tOpGDMJ1HDZ6_sytc3xdZ7uK96SunMykXekcfn4JAsoo7tYfDR5DnnIWlExNTFXJpCZg_iOAByGZkv6Er3yAcjWWG6iF0lG_pR3Pb8Y4OhaLGAE-WMenNMCGOz0FBlXOsIa_jtCelnEbsd9_jRks77odZ6_8HP29CRQqxbxtdJapWPIOysl3V5CeZASKpPD2fXjw6EjtZoHWOpd62qfCkibOUVDDE3nmZ5xCWx8GNVMnRA7rD-opB22q6H-VoZz7svT1_vnN44fzw2LZYt_-wqPiAOn4VTnSxRUqUEwa6D1\n"
					+ "2yd6HrQS01HTH6Xllq5kzdutZQBj2ujO4VR0PflaBmA6PkskQCBEk0WQz9gt1143sSzUXzxAicgYSloyjvzQjeZlYvD7jd6q1nBcWR5BA4a3ua3cmEJtL1YFywWgmfsPwqX6ps2PmRx-EGbhT1Si6TuEstEceVdnXEGyD0vdFEFH9bjUyTuq1UG5r-i34teGp6fOE6q9JjLIyiowFZC9PBG5Jd4TS3VNzfxWcGGMmlJhGZFdRY58jIB_NsFIrTZ6d4I1TssUhb7G4VITDLZ2wVwRJsRNgnWU8UaOpkSxF2Y59lu_5ePcm4zQ0VUjVm8FJPKT_bb-k8bsaMlVYLYLUjo0qnzbjJFckVlo0sTphYvnG3doMtm9q3pXtFOPNmRy7T-GzlkcMz1GfcTUkDXMiNUogUHLHuvTCtfYalZtKCkgP_hZqDN93nms_MraOHWTE5dug4MYm7acKJX6MzMmqgX44XkiTLkRcQ3bn2DR2VVWFuVkfrco\n"
					+ "UUnw5kB6wHmgACv7eqyoxkMbJ4WDpNFzItpdR8g4QzuPQcpic2qK2g3712uNvmmqEWyUa97OTYfG6q2iV0IBvCPIB7iAN_Yn4bkVX62boeuNYfxiQcO_KE6pBIeK-oCjSmyOY0aJbvUrY22OD37jh1PlHPVk5JnmBNXW2U3kVswweB_ULuQMJlRlBDJKpfVHPAJzILQf-kSWubuoAly1nZXkNulTCafIlMq4wTK8tjoEeT5MMUoPhe1EgZo5HGtCSOOBiDrNkBoDhk7pjLbQRlpYLrXlv93pW8BC_M_GAG3J52nG8O20qd7c4jA8gex4llOUq6h2Kt4UFlFIPQAzhzkX_2ygnwcCqO2CJUewaENBIrubJJdpH0mlQLhYwPwCxF6QbKXdV_C7shfZKqRLBlEu7e1g9s9vuoYEUKoYh3EE0v168ek-2vBDzabD9b95Ak7ZkAV8MM7uLtxZBh4uWBWxLi3b0mXa0_ZMYfZJ-U05fFkRuGSj\n"
					+ "S2xtO5bjjoQEAVtYKoGAwhkkWIn6_oEEhFhxgPtxjeInDEu1wwZDZt5TvI_Ltj8HF-92SFbWCyYH07kn0ufXkyEgRyK8Mj0F0mYZ9F37dLSISTBnA-MS8I5UhSPIMS6AP7QLKOD7Hf3QPbJJ8ts6aD-DVcbJX879G3eIxGcPw7RvMQdOKZGeI8V1DOA-HvgrDPrpvT478UgtB5f4CpfO3FMVOvPq9SeEBent95wflH3OdVHp6ZOQ55iDtzFqpcKD6JK-9jLFuBbM9nARGuKOlLyXvkkH-PBG0mRAS_CNJtoFjHPpv3N9EjMTX0PrVTM_PW9OLsYDLEEbJrgBWuECh3rdzGC4_zeea-3Gq-2WFh_ES8-u5PgdbnksWgFWW0ijYy_rDqsK9piLYsp811XT5wbylKC62fc0fLpn0UCsV7nm5Uz2bX9qjD_BYOWJ4PAmYFlGBazS-oJnIUxTAxSsFjqCe6upnnPyXm4uzb3wPiNRdtOJL7CP\n"
					+ "PYSLJ3J_CW9wMT8WQzlceEjl4yrAUQt0ad76uuFYYM6mkI11FrZK-gQjADniW5ggVHYMvPbXx7rIkqiy65Cci6BNsETKU1gf8O5nvExQ8e8VSvnT4V0lGHuKIMgItcG0tSgFxUXoNytQPfjp8kcU_zzuHwh5bDe7T6-K3reZkG26V3m9lDq2xGDm7A6ujrb2vU1dGfqyOKb5vLYOC1VOQ9QBAhOcEWz6ci6fHM-FxcOUdxu7c6jwGAenCo6FoWyWckvHiaEVBZg2V5XRV_ePvo4kl6MdKr7e5J9mdWl00NN6v8Gy9uQK4hoowqvfWR1a_R9GGv4QS3Q6RDjOxVBO3ePYzB8v8sfYYHNtPMSKQJOfEhFQS4bcY_ReUtNd7zSQ_2Lbm75d_Rg-NfeUR4DkXZhKwMVRRGJ3Q42hMfVbo8A-Xt4MlnlkqSj3GNBQ6WDN_mHEIsiaUw-JDYApFVHf-uyyNI3yNIWN0q0d-3Y66ovzLm1KODe7\n"
					+ "aYpoc8E0RL8uUG2h8lMLwGcuUPdEVxQM7wz0nl5ucgI4Q8KMZzjLJtfvjcMgBY0HKwH7E4sqRei9Vd6AHss04_d_-tAWNfdZYKGnqj_RFe5sGyDUof3abVk-mfKWEq6WKL3PzjXR6UfGIhDRDN4e1CqEHDisXdgAPfDTLNWCgNKAVYqhagXqwrU1KZV1wSlNGCOGgJbmVu-rsq0t0EFngFx9BcD_OtqTRihe1xynZkNj_TKqv9Q2cuS5qgCoI2uQd7Jjm0Ig2WSmUUyRrUWfW1JeTeV3xRxZTc9zQuW2eEM-aVAyLyezYMgV2EDgaYoIU83zvd9jwFcHeUfSp9bFPdOw4K4TjA2S8F0aiRNUge994znvVzeohH6xK4UNGjTXxCtmIbm6-6YFloi7V185zIKk7ykaXG4sLMC17PhTpCC6DCdyRGHgftWKu7oDg0NuVcNppzZPpaQsNhJgU9v3CkS68M1fPOhtj-iwimV4_DkYyXT3w4yG\n"
					+ "ZwLJKCAvEYxV8oLr22jOG2jj-LHFpdv2J3IJA; path=/; HttpOnly; SameSite=None; secure; domain=gxpdt.oracle.com" ;
			
		}
}
