.class final Lcom/google/android/gms/internal/auth-api-phone/zzn;
.super Lk6/a$a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lk6/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lm6/a;Ljava/lang/Object;Ll6/c;Ll6/j;)Lk6/a$f;
    .locals 6

    check-cast p4, Lk6/a$d$c;

    new-instance p4, Lcom/google/android/gms/internal/auth-api-phone/zzw;

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/auth-api-phone/zzw;-><init>(Landroid/content/Context;Landroid/os/Looper;Lm6/a;Ll6/c;Ll6/j;)V

    return-object p4
.end method
