.class public final Lwb/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwb/f$a;
    }
.end annotation


# static fields
.field public static final a:Lwb/f$a;

.field public static b:Lwb/f$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwb/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lwb/f$a;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    sput-object v0, Lwb/f;->a:Lwb/f$a;

    return-void
.end method
