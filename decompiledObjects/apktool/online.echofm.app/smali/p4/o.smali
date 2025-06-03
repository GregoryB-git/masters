.class public final synthetic Lp4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB3/h;


# static fields
.field public static final a:LB3/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp4/o;

    .line 2
    .line 3
    invoke-direct {v0}, Lp4/o;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp4/o;->a:LB3/h;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LB3/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/firebase/iid/Registrar;->lambda$getComponents$0$Registrar(LB3/e;)Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
