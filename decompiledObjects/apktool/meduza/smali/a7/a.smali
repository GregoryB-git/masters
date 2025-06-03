.class public final La7/a;
.super Lk6/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lk6/d<",
        "Lk6/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lk6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk6/a$g;

    invoke-direct {v0}, Lk6/a$g;-><init>()V

    new-instance v1, Lk6/a;

    new-instance v2, Lcom/google/android/gms/internal/fido/zzo;

    invoke-direct {v2}, Lcom/google/android/gms/internal/fido/zzo;-><init>()V

    const-string v3, "Fido.FIDO2_API"

    invoke-direct {v1, v3, v2, v0}, Lk6/a;-><init>(Ljava/lang/String;Lk6/a$a;Lk6/a$g;)V

    sput-object v1, La7/a;->a:Lk6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, La7/a;->a:Lk6/a;

    sget-object v1, Lk6/a$d;->j:Lk6/a$d$c;

    new-instance v2, Lz4/i;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lz4/i;-><init>(I)V

    invoke-direct {p0, p1, v0, v1, v2}, Lk6/d;-><init>(Landroid/app/Activity;Lk6/a;Lk6/a$d;Ll6/o;)V

    return-void
.end method
