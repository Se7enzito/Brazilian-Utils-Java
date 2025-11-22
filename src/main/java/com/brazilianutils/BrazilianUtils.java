package com.brazilianutils;

import com.brazilianutils.utils.cnh.CnhUtils;
import com.brazilianutils.utils.cpf.CpfUtils;
import com.brazilianutils.utils.cnpj.CnpjUtils;
import com.brazilianutils.utils.cep.CepUtils;
import com.brazilianutils.utils.data.DataUtils;
import com.brazilianutils.utils.email.EmailUtils;
import com.brazilianutils.utils.feriado.FeriadoUtils;
import com.brazilianutils.utils.ibge.IbgeUtils;
import com.brazilianutils.utils.monetario.MonetarioUtils;
import com.brazilianutils.utils.naturezaJuridica.NaturezaJuridicaUtils;
import com.brazilianutils.utils.phone.PhoneUtils;
import com.brazilianutils.utils.pis.PisUtils;
import com.brazilianutils.utils.placaCarro.PlacaCarroUtils;
import com.brazilianutils.utils.processoJuridico.ProcessoJuridicoUtils;
import com.brazilianutils.utils.renavam.RenavamUtils;
import com.brazilianutils.utils.tituloEleitor.TituloEleitorUtils;

public class BrazilianUtils {

    public static CepUtils cep() { return new CepUtils(); }
    public static CnhUtils cnh() { return new CnhUtils(); }
    public static CnpjUtils cnpj() { return new CnpjUtils(); }
    public static CpfUtils cpf() { return new CpfUtils(); }
    public static DataUtils data() { return new DataUtils(); }
    public static EmailUtils email() { return new EmailUtils(); }
    public static FeriadoUtils feriado() { return new FeriadoUtils(); }
    public static IbgeUtils ibge() { return new IbgeUtils(); }
    public static MonetarioUtils monetario() { return new MonetarioUtils(); }
    public static NaturezaJuridicaUtils naturezaJuridica() { return new NaturezaJuridicaUtils(); }
    public static PhoneUtils phone() { return new PhoneUtils(); }
    public static PisUtils pis() { return new PisUtils(); }
    public static PlacaCarroUtils placaCarro() { return new PlacaCarroUtils(); }
    public static ProcessoJuridicoUtils processo() { return new ProcessoJuridicoUtils(); }
    public static RenavamUtils renavam() { return new RenavamUtils(); }
    public static TituloEleitorUtils tituloEleitor() { return new TituloEleitorUtils(); }

}
