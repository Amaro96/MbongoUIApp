using MbongoApp.Models;
using System;
using System.Collections.Generic;
using System.Text;

namespace MbongoApp.Services
{
   public class FakeBankTransferService
    {
        static FakeBankTransferService _instance;

        public static FakeBankTransferService Instance
        {
            get
            {
                if (_instance == null)
                    _instance = new FakeBankTransferService();

                return _instance;
            }
        }

        public IEnumerable<Bank> GetBanks()
        {
            return new List<Bank>()
            {
                new Bank{bankLogo = "Barclays_Bank_logo", bankName ="Barclays Bank"},
                new Bank{bankLogo = "Access_Bank_Logo", bankName ="Access Bank"},
                new Bank{bankLogo = "ghana", bankName ="Ghana Commercial Bank"},
                new Bank{bankLogo = "fidelity_bank_ltd", bankName ="Fidelity Bank"},
                new Bank{bankLogo = "consolidatedbank", bankName ="Consolidated Bank of Ghana LTD"},

            };
        }
    }
}
