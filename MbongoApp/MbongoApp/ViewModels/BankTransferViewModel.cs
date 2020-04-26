using MbongoApp.Models;
using MbongoApp.Services;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;
using Xamarin.Forms;

namespace MbongoApp.ViewModels
{
   public class BankTransferViewModel : BindableObject
    {
        ObservableCollection<Bank> _banks;

        public BankTransferViewModel()
        {
            LoadBanks();
        }

        public ObservableCollection<Bank> Banks
        {
            get { return _banks; }
            set { _banks = value;
                OnPropertyChanged();
            }
        }

        void LoadBanks()
        {
            var banks = FakeBankTransferService.Instance.GetBanks();
            Banks = new ObservableCollection<Bank>(banks);
        }

    }
}
