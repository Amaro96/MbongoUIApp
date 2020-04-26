using MbongoApp.Models;
using MbongoApp.ViewModels;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace MbongoApp.Views
{
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class BankTransferPage : ContentPage
    {
        public BankTransferPage()
        {
            InitializeComponent();

            BindingContext = new BankTransferViewModel();
        }
    }
}