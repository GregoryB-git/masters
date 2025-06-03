.class public final Lj1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj1/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj1/a;

    invoke-direct {v0}, Lj1/a;-><init>()V

    sput-object v0, Lj1/a;->a:Lj1/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const v0, 0xf4240

    invoke-static {v0}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    move-result v0

    return v0
.end method
