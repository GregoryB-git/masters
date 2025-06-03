.class public final Li2/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Li2/c$a;

.field public static final c:Li2/c$a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Li2/c$a;

    const-string v1, "FOLD"

    invoke-direct {v0, v1}, Li2/c$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Li2/c$a;->b:Li2/c$a;

    new-instance v0, Li2/c$a;

    const-string v1, "HINGE"

    invoke-direct {v0, v1}, Li2/c$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Li2/c$a;->c:Li2/c$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li2/c$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li2/c$a;->a:Ljava/lang/String;

    return-object v0
.end method
