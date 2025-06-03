.class public final Leb/j$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Leb/j$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/j$b;

    invoke-direct {v0}, Leb/j$b;-><init>()V

    sput-object v0, Leb/j$b;->a:Leb/j$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "identity"

    return-object v0
.end method

.method public final b(Lgb/j2$a;)Ljava/io/OutputStream;
    .locals 0

    return-object p1
.end method

.method public final c(Lgb/v2$a;)Ljava/io/InputStream;
    .locals 0

    return-object p1
.end method
