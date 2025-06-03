.class public final Ly2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ly2/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ly2/a;

    invoke-direct {v0}, Ly2/a;-><init>()V

    sput-object v0, Ly2/a;->a:Ly2/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 2

    invoke-static {}, Lcom/google/android/recaptcha/internal/a;->j()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getProcessName()"

    invoke-static {v0, v1}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
