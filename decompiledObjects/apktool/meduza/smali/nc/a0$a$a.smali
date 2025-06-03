.class public final Lnc/a0$a$a;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnc/a0$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/l<",
        "Lub/h$b;",
        "Lnc/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lnc/a0$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnc/a0$a$a;

    invoke-direct {v0}, Lnc/a0$a$a;-><init>()V

    sput-object v0, Lnc/a0$a$a;->a:Lnc/a0$a$a;

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

    check-cast p1, Lub/h$b;

    instance-of v0, p1, Lnc/a0;

    if-eqz v0, :cond_0

    check-cast p1, Lnc/a0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
