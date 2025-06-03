.class public final Llb/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb/b$a;
    }
.end annotation


# static fields
.field public static volatile a:Lma/o;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lma/o;->a()Lma/o;

    move-result-object v0

    sput-object v0, Llb/b;->a:Lma/o;

    return-void
.end method
