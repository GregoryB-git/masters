.class public final synthetic Lp4/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/b;


# static fields
.field public static final a:LV2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lp4/q;

    .line 2
    .line 3
    invoke-direct {v0}, Lp4/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp4/q;->a:LV2/b;

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
.method public a(LV2/j;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/firebase/iid/Registrar$a;->e(LV2/j;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
