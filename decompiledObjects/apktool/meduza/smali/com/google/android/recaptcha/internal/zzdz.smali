.class final synthetic Lcom/google/android/recaptcha/internal/zzdz;
.super Lec/h;
.source "SourceFile"

# interfaces
.implements Ldc/l;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/google/android/recaptcha/internal/zzec;

    const/4 v1, 0x1

    const-string v4, "isRetriable"

    const-string v5, "isRetriable(Ljava/lang/Exception;)Z"

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lec/h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/Exception;

    iget-object v0, p0, Lec/b;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/recaptcha/internal/zzec;

    invoke-static {v0, p1}, Lcom/google/android/recaptcha/internal/zzec;->zzk(Lcom/google/android/recaptcha/internal/zzec;Ljava/lang/Exception;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
