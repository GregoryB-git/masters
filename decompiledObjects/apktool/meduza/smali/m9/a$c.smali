.class public final Lm9/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm9/a0<",
        "TRespT;>;"
    }
.end annotation


# instance fields
.field public final a:Lm9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm9/a<",
            "TReqT;TRespT;TCallbackT;>.a;"
        }
    .end annotation
.end field

.field public b:I

.field public final synthetic c:Lm9/a;


# direct methods
.method public constructor <init>(Lm9/a;Lm9/a$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/a<",
            "TReqT;TRespT;TCallbackT;>.a;)V"
        }
    .end annotation

    iput-object p1, p0, Lm9/a$c;->c:Lm9/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lm9/a$c;->b:I

    iput-object p2, p0, Lm9/a$c;->a:Lm9/a$a;

    return-void
.end method
