.class final Lokhttp3/internal/platform/AndroidPlatform$CloseGuard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/platform/AndroidPlatform;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CloseGuard"
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Method;

.field public final b:Ljava/lang/reflect/Method;

.field public final c:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/platform/AndroidPlatform$CloseGuard;->a:Ljava/lang/reflect/Method;

    iput-object p2, p0, Lokhttp3/internal/platform/AndroidPlatform$CloseGuard;->b:Ljava/lang/reflect/Method;

    iput-object p3, p0, Lokhttp3/internal/platform/AndroidPlatform$CloseGuard;->c:Ljava/lang/reflect/Method;

    return-void
.end method
