.class public final Lb/w$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lb/w$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/w$b;

    invoke-direct {v0}, Lb/w$b;-><init>()V

    sput-object v0, Lb/w$b;->a:Lb/w$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ldc/l;Ldc/l;Ldc/a;Ldc/a;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc/l<",
            "-",
            "Lb/b;",
            "Lrb/h;",
            ">;",
            "Ldc/l<",
            "-",
            "Lb/b;",
            "Lrb/h;",
            ">;",
            "Ldc/a<",
            "Lrb/h;",
            ">;",
            "Ldc/a<",
            "Lrb/h;",
            ">;)",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    const-string v0, "onBackStarted"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackProgressed"

    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackInvoked"

    invoke-static {p3, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBackCancelled"

    invoke-static {p4, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb/w$b$a;

    invoke-direct {v0, p1, p2, p3, p4}, Lb/w$b$a;-><init>(Ldc/l;Ldc/l;Ldc/a;Ldc/a;)V

    return-object v0
.end method
