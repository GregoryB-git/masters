.class public final Li2/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final b:Li2/b$b;

.field public static final c:Li2/b$b;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Li2/b$b;

    const-string v1, "FLAT"

    invoke-direct {v0, v1}, Li2/b$b;-><init>(Ljava/lang/String;)V

    sput-object v0, Li2/b$b;->b:Li2/b$b;

    new-instance v0, Li2/b$b;

    const-string v1, "HALF_OPENED"

    invoke-direct {v0, v1}, Li2/b$b;-><init>(Ljava/lang/String;)V

    sput-object v0, Li2/b$b;->c:Li2/b$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/b$b;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li2/b$b;->a:Ljava/lang/String;

    return-object v0
.end method
