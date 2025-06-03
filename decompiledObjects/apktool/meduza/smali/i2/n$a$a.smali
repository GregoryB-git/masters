.class public final Li2/n$a$a;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/n$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/l<",
        "Li2/n;",
        "Li2/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Li2/n$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/n$a$a;

    invoke-direct {v0}, Li2/n$a$a;-><init>()V

    sput-object v0, Li2/n$a$a;->a:Li2/n$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Li2/n;

    const-string v0, "it"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
