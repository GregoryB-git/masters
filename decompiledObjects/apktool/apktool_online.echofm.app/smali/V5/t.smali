.class public final LV5/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LV5/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV5/t;

    .line 2
    .line 3
    invoke-direct {v0}, LV5/t;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV5/t;->a:LV5/t;

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
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "kotlin.Unit"

    .line 2
    .line 3
    return-object v0
.end method
